package com.windhike.library;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by gzzyj on 2016/9/29.
 */
public abstract class SimpleRecyclerHolder extends RecyclerView.ViewHolder{

    public SimpleRecyclerHolder(View itemView) {
        super(itemView);
    }

    public void bindView(Object object) {

    }
}
