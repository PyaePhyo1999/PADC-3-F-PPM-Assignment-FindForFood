package com.example.acer.findforfood.data.vo.models;

import com.example.acer.findforfood.network.FeatureDataAgent;
import com.example.acer.findforfood.network.FeaturedOkHttpDataAgent;
import com.example.acer.findforfood.network.GuideDataAgent;
import com.example.acer.findforfood.network.GuideOkHttpDataAgent;

/**
 * Created by Acer on 1/13/2018.
 */

public class FeatureModel {
    public FeatureDataAgent mFeatureDataAgent;
    private static FeatureModel sObjInstance;

    private FeatureModel(){

        mFeatureDataAgent = FeaturedOkHttpDataAgent.getsObjInstance();

    }

    public static FeatureModel getsObjInstance(){
        if(sObjInstance==null)
        {
            sObjInstance=new FeatureModel();
        }
        return sObjInstance;
    }

    public void loadFeatured(){
        mFeatureDataAgent.loadFeatured();
    }

}
