package com.example.acer.findforfood.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Acer on 1/13/2018.
 */

public class FeaturedVO {
    @SerializedName("burpple-featured-id")
    private String featureId;

    @SerializedName("burpple-featured-image")
    private String featureImage;

    @SerializedName( "burpple-featured-title")
    private String featureTitle;

    @SerializedName("burpple-featured-desc")
    private String featureDescription;

    @SerializedName( "burpple-featured-tag")
    private String featureTag;

    public String getFeatureId() {
        return featureId;
    }

    public String getFeatureImage() {
        return featureImage;
    }

    public String getFeatureTitle() {
        return featureTitle;
    }

    public String getFeatureDescription() {
        return featureDescription;
    }

    public String getFeatureTag() {
        return featureTag;
    }
}
