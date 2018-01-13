package com.example.acer.findforfood.events;

import com.example.acer.findforfood.data.vo.FeaturedVO;
import com.example.acer.findforfood.data.vo.GuidesVO;

import java.util.List;

/**
 * Created by Acer on 1/13/2018.
 */

public class LoadFeaturedEvent {
    private List<FeaturedVO> mFeaturedList;

    public List<FeaturedVO> getFeaturedList() {
        return mFeaturedList;
    }

    public LoadFeaturedEvent(List<FeaturedVO> featuredList) {

        this.mFeaturedList = featuredList;
    }

}
