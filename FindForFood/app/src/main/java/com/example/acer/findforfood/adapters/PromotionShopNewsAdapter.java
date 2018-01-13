package com.example.acer.findforfood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.acer.findforfood.R;

import com.example.acer.findforfood.data.vo.PromotionVO;
import com.example.acer.findforfood.viewholders.ItemPromotionViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acer on 1/5/2018.
 */

public class PromotionShopNewsAdapter extends RecyclerView.Adapter<ItemPromotionViewHolder> {
       private List<PromotionVO> mPromotionList;

    public PromotionShopNewsAdapter() {
        this.mPromotionList = new ArrayList<>();
    }

    @Override
    public ItemPromotionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_promotion_shops,parent,false);
        ItemPromotionViewHolder itemPromotionShopNewsViewHolder = new ItemPromotionViewHolder(view);
        return itemPromotionShopNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemPromotionViewHolder holder, int position) {
        holder.setPromotion(mPromotionList.get(position));
    }

    @Override
    public int getItemCount() {
        return mPromotionList.size();
    }
    public void setPromotion(List<PromotionVO> promotionList) {
        mPromotionList = promotionList;
        notifyDataSetChanged();
    }


}
