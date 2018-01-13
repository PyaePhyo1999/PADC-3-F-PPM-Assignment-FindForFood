package com.example.acer.findforfood.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.acer.findforfood.R;
import com.example.acer.findforfood.data.vo.PromotionVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Acer on 1/13/2018.
 */

public class ItemPromotionViewHolder extends RecyclerView.ViewHolder {

    public ItemPromotionViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
    @BindView(R.id.tv_promotion_shop_area)
    TextView tvPromotionShopArea;

    @BindView(R.id.tv_4_for_1_free)
    TextView tv4For1free;

    @BindView(R.id.tv_dead_line_date)
    TextView tvDeadLineDate;

    @BindView(R.id.tv_bbq_and_grill)
    TextView tvShopName;

    @BindView(R.id.iv_promotion_shop)
    ImageView ivPromotionShop;




    public void setPromotion(PromotionVO promotion){
        tvPromotionShopArea.setText(promotion.getPromotionShop().getPromotionShopName());
        tv4For1free.setText(promotion.getPromotionTitle());
        tvDeadLineDate.setText(promotion.getPromotionUntil());
        tvShopName.setText(promotion.getPromotionShop().getPromotionShopName());

        Glide.with(ivPromotionShop.getContext())
                .load(promotion.getPromotionImage())
                .into(ivPromotionShop);
    }
}
