package com.example.acer.findforfood.data.vo.models;

import com.example.acer.findforfood.network.GuideDataAgent;
import com.example.acer.findforfood.network.GuideOkHttpDataAgent;
import com.example.acer.findforfood.network.PromotionRetrofitDataAgent;

/**
 * Created by Acer on 1/13/2018.
 */

public class GuideModel {
    public GuideDataAgent mGuideDataAgent;
    private static GuideModel sObjInstance;

    private GuideModel(){

        mGuideDataAgent = GuideOkHttpDataAgent.getsObjInstance();

    }

    public static GuideModel getsObjInstance(){
        if(sObjInstance==null)
        {
            sObjInstance=new GuideModel();
        }
        return sObjInstance;
    }

    public void LoadGuide(){
        mGuideDataAgent.loadGuide();
    }

}


