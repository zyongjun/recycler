package com.windhike.recycler;

import com.windhike.recyclerutils.SimpleRecyclerAdapter;

/**
 * Created by Administrator on 2016/10/8 0008.
 */
public class SimpleMainAdapter extends SimpleRecyclerAdapter {

    public SimpleMainAdapter() {
        registViewTemplate(1,SimpleSearchHolder.class);
        registViewTemplate(2,SimpleImageHolder.class);
    }

    @Override
    protected Object getItem(int position) {
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return position+1;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
