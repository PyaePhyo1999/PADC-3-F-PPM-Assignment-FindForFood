package com.example.acer.findforfood.network;

import android.os.AsyncTask;
import android.util.Log;

import com.example.acer.findforfood.FindForFoodApp;
import com.example.acer.findforfood.events.LoadPromotionEvent;
import com.example.acer.findforfood.network.responses.GetPromotionResponse;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.TimeUnit;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Acer on 1/13/2018.
 */

public class PromotionOkHttpDataAgent implements PromotionDataAgent{
    private static PromotionOkHttpDataAgent sObjInstance;

    public PromotionOkHttpDataAgent() {
    }

    public static PromotionOkHttpDataAgent getsObjInstance() {
        if (sObjInstance == null) {
            sObjInstance = new PromotionOkHttpDataAgent();
        }
        return sObjInstance;
    }

    @Override
    public void loadPromotion() {
        new LoadPromotionTask().execute("http://padcmyanmar.com/padc-3/burpple-food-places/apis/v1/getPromotions.php");
    }

    private static class LoadPromotionTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {
            String url = urls[0];

            OkHttpClient httpClient = new OkHttpClient.Builder() //1
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .writeTimeout(15, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .build();

            RequestBody formBody = new FormBody.Builder() //2
                    .add("access_token", "b002c7e1a528b7cb460933fc2875e916")
                    .add("page", "1")
                    .build();

            Request request = new Request.Builder() //3
                    .url(url)
                    .post(formBody)
                    .build();

            String responseString = null;
            try {
                Response response = httpClient.newCall(request).execute(); //4
                if (response.isSuccessful() && response.body() != null) {
                    responseString = response.body().string();
                }

            } catch (Exception e) {
                Log.e(FindForFoodApp.LOG_TAG, e.getMessage());
            }

            return responseString;
        }

        @Override
        protected void onPostExecute(String response) {
            super.onPostExecute(response);

            Gson gson = new Gson();
            GetPromotionResponse getPromotionResponse = gson.fromJson(response, GetPromotionResponse.class);

            LoadPromotionEvent event = new LoadPromotionEvent(getPromotionResponse.getPromotions());
            EventBus eventBus = EventBus.getDefault();
            eventBus.post(event);
        }
    }
}
