package com.windhike.recycler;

import com.windhike.library.RecyclerPresenter;

/**
 * Created by Administrator on 2016/10/7 0007.
 */
public class MainPresenter extends RecyclerPresenter{

    public MainPresenter() {
        registViewTemplate(1,SearchHolder.class);
        registViewTemplate(2,ImageHolder.class);
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
