package com.example.acer.findforfood.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifBitmapProvider;
import com.example.acer.findforfood.R;
import com.example.acer.findforfood.data.vo.FeaturedVO;
import com.example.acer.findforfood.viewitems.ImagesInShopDetailViewItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Acer on 1/5/2018.
 */

public class ImagesInShopDetailsAdapter extends PagerAdapter {

    @BindView(R.id.tv_featured)
    TextView tvFeature;

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_sub_title)
    TextView tvSubtitle;

    @BindView(R.id.iv_shop_image)
    ImageView ivShopImage;

    private List<FeaturedVO> mFeatureList;

    public ImagesInShopDetailsAdapter() {
        this.mFeatureList = new ArrayList<>();
    }


    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return (view == (View) object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Context context = container.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ImagesInShopDetailViewItem view = (ImagesInShopDetailViewItem) layoutInflater.inflate(R.layout.items_shop_details_image, container, false);

        ButterKnife.bind(this, view);
        tvFeature.setText(mFeatureList.get(position).getFeatureTag());
        tvTitle.setText(mFeatureList.get(position).getFeatureTitle());
        tvSubtitle.setText(mFeatureList.get(position).getFeatureDescription());

        Glide.with(ivShopImage.getContext())
                .load(mFeatureList.get(position).getFeatureImage())
                .into(ivShopImage);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public void setFeatured(List<FeaturedVO> feature)
    {
        mFeatureList = feature;
        notifyDataSetChanged();
    }
    }


