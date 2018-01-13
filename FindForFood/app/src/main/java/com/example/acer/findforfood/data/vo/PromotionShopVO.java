package com.example.acer.findforfood.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Acer on 1/13/2018.
 */

public class PromotionShopVO {

    @SerializedName("burpple-shop-id")
    private String promotionShopId;

    @SerializedName("burpple-shop-name")
    private String promotionShopName;

    @SerializedName("burpple-shop-area")
    private String promotionShopArea;

    public String getPromotionShopName() {
        return promotionShopName;
    }

    public String getPromotionShopArea() {
        return promotionShopArea;
    }

    public String getPromotionShopId() {

        return promotionShopId;
    }
}
