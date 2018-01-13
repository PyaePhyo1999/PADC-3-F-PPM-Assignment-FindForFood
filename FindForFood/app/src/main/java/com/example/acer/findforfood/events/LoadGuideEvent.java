package com.example.acer.findforfood.events;

import com.example.acer.findforfood.data.vo.GuidesVO;


import java.util.List;

/**
 * Created by Acer on 1/13/2018.
 */

public class LoadGuideEvent {
    private List<GuidesVO> mGuideList;

    public List<GuidesVO> getGuideList() {
        return mGuideList;
    }

    public LoadGuideEvent(List<GuidesVO> guideList) {

        this.mGuideList = guideList;
    }
}
