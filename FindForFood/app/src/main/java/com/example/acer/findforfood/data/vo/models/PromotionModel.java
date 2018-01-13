package com.example.acer.findforfood.data.vo.models;

import com.example.acer.findforfood.network.PromotionDataAgent;
import com.example.acer.findforfood.network.PromotionOkHttpDataAgent;
import com.example.acer.findforfood.network.PromotionRetrofitDataAgent;

/**
 * Created by Acer on 1/13/2018.
 */

public class PromotionModel {
    private PromotionDataAgent mPromotionDataAgent;

    private static PromotionModel sObjInstance;

    private PromotionModel(){

      //  mPromotionDataAgent = PromotionRetrofitDataAgent.getsObjInstance();
        mPromotionDataAgent= PromotionOkHttpDataAgent.getsObjInstance();
    }

    public static PromotionModel getsObjInstance(){
        if(sObjInstance==null)
        {
            sObjInstance=new PromotionModel();
        }
        return sObjInstance;
    }

    public void LoadPromotion(){
        mPromotionDataAgent.loadPromotion();
    }

}
