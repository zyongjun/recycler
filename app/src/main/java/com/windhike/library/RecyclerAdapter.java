package com.windhike.library;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by gzzyj on 2016/9/29.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerHolder>{
    private RecyclerPresenter mPresenter;

    public RecyclerAdapter(RecyclerPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mPresenter.createHolder(parent,viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
        holder.bindView(position,mPresenter);
    }

    @Override
    public int getItemViewType(int position) {
        return mPresenter.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return mPresenter.getItemCount();
    }
}
