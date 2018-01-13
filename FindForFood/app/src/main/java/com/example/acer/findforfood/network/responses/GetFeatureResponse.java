package com.example.acer.findforfood.network.responses;

import com.example.acer.findforfood.data.vo.FeaturedVO;
;


import java.util.List;

/**
 * Created by Acer on 1/13/2018.
 */

public class GetFeatureResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<FeaturedVO> featured;

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

    public List<FeaturedVO> getFeatured() {
        return featured;
    }

}
