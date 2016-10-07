package com.windhike.recycler;

import android.view.View;
import android.widget.ImageView;

import com.windhike.library.HolderLayout;
import com.windhike.library.RecyclerHolder;
import com.windhike.library.SimpleRecyclerAdapter;
import com.windhike.library.SimpleRecyclerHolder;

/**
 * Created by Administrator on 2016/10/7 0007.
 */
@HolderLayout(R.layout.holder_img)
public class SimpleImageHolder extends SimpleRecyclerHolder {
    private ImageView mIvImg;
    public SimpleImageHolder(View itemView) {
        super(itemView);
        mIvImg = (ImageView)itemView.findViewById(R.id.iv_img);
    }

    @Override
    public void bindView(Object object) {

    }
}
