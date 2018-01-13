package com.example.acer.findforfood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.acer.findforfood.R;
import com.example.acer.findforfood.data.vo.GuidesVO;

import com.example.acer.findforfood.viewholders.ItemShopGuidesViewHolder;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acer on 1/5/2018.
 */

public class ShopGuidesAdapter extends RecyclerView.Adapter<ItemShopGuidesViewHolder> {
    private List<GuidesVO> mGuideList;
    public ShopGuidesAdapter() {
           this.mGuideList = new ArrayList<>();
    }

    @Override
    public ItemShopGuidesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_shops_guide,parent,false);
        ItemShopGuidesViewHolder itemShopGuidesViewHolder = new ItemShopGuidesViewHolder(view);
        return itemShopGuidesViewHolder;

    }

    @Override
    public void onBindViewHolder(ItemShopGuidesViewHolder holder, int position) {
          holder.setGuide(mGuideList.get(position));
    }

    @Override
    public int getItemCount() {
        return mGuideList.size();
    }

    public void setGuide(List<GuidesVO> GuideList) {
        mGuideList = GuideList;
        notifyDataSetChanged();
    }


}
