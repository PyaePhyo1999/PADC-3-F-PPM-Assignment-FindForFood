package com.example.acer.findforfood.network;

import com.example.acer.findforfood.network.responses.GetPromotionResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Acer on 1/13/2018.
 */

public interface PromotionApi {
    @FormUrlEncoded
    @POST("getPromotions.php")
    Call<GetPromotionResponse> getPromotions(@Field("page") int page,
                                             @Field("access_token") String accessToken);




}
