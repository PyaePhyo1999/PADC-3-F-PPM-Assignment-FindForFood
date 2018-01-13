package com.example.acer.findforfood.events;

import com.example.acer.findforfood.data.vo.PromotionVO;

import java.util.List;

/**
 * Created by Acer on 1/13/2018.
 */

public class LoadPromotionEvent {
    private List<PromotionVO> promotionList;

    public List<PromotionVO> getPromotionList() {
        return promotionList;
    }

    public LoadPromotionEvent(List<PromotionVO> promotionList) {

        this.promotionList = promotionList;
    }
}
