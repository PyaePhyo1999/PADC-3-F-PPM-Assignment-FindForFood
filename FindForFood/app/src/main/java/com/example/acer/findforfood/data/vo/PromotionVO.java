package com.example.acer.findforfood.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Acer on 1/13/2018.
 */

public class PromotionVO {
    @SerializedName("burpple-promotion-id")
    private String promotionId;

    @SerializedName("burpple-promotion-image")
    private String promotionImage;

    @SerializedName("burpple-promotion-title")
    private String promotionTitle;

    @SerializedName("burpple-promotion-until")
    private String promotionUntil;

    @SerializedName("burpple-promotion-shop")
    private PromotionShopVO promotionShop;

    @SerializedName("is-burpple-exclusive")
    private boolean burppleExclusive;

    @SerializedName("burpple-promotion-term")
    private List<String> promotionTerms;

    public String getPromotionId() {
        return promotionId;
    }

    public String getPromotionImage() {
        return promotionImage;
    }

    public String getPromotionTitle() {
        return promotionTitle;
    }

    public String getPromotionUntil() {
        return promotionUntil;
    }

    public PromotionShopVO getPromotionShop() {
        return promotionShop;
    }

    public boolean isBurppleExclusive() {
        return burppleExclusive;
    }

    public List<String> getPromotionTerms() {
        return promotionTerms;
    }
}
