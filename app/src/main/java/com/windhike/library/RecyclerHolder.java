package com.windhike.library;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by gzzyj on 2016/9/29.
 */
public abstract class RecyclerHolder<T> extends RecyclerView.ViewHolder{

    public RecyclerHolder(View itemView) {
        super(itemView);
    }

    public void bindView(int position,T presenter) {

    }
}
