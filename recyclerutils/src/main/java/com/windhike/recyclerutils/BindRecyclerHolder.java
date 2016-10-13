package com.windhike.recyclerutils;

import android.view.View;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/10/11 0011.
 */
public abstract class BindRecyclerHolder<T> extends RecyclerHolder<T> {
    public BindRecyclerHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    @Override
    public void bindView(int position, T presenter) {
        super.bindView(position, presenter);
    }
}
