package com.example.acer.findforfood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.acer.findforfood.R;
import com.example.acer.findforfood.viewholders.ItemDetailNewsViewHolder;

/**
 * Created by Acer on 1/11/2018.
 */

public class DetailsNewsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_details_newly_opened,parent,false);
        ItemDetailNewsViewHolder itemDetailNewsViewHolder = new ItemDetailNewsViewHolder(view);
        return itemDetailNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
