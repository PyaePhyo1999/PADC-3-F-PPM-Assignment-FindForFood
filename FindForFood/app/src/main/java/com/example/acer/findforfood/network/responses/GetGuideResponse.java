package com.example.acer.findforfood.network.responses;

import com.example.acer.findforfood.data.vo.GuidesVO;
import com.example.acer.findforfood.data.vo.PromotionVO;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Acer on 1/13/2018.
 */

public class GetGuideResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    @SerializedName("featured")
    private List<GuidesVO> guides;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<GuidesVO> getGuides() {
        return guides;
    }
}
