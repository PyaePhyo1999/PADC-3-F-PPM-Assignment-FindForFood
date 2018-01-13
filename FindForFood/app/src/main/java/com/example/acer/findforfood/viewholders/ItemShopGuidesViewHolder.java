package com.example.acer.findforfood.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.acer.findforfood.R;
import com.example.acer.findforfood.data.vo.GuidesVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Acer on 1/5/2018.
 */

public class ItemShopGuidesViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_description)
    TextView tvDescForGuide;

    @BindView(R.id.iv_guide_shop)
    ImageView ivGuideShop;

    public ItemShopGuidesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
    public void setGuide(GuidesVO guide){

        tvTitle.setText(guide.getGuideTitle());
        tvDescForGuide.setText(guide.getGuideDesc());

        Glide.with(ivGuideShop.getContext())
                .load(guide.getGuideImage())
                .into(ivGuideShop);
    }

}
