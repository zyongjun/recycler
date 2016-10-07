package com.windhike.recycler;

import android.view.View;
import android.widget.ImageView;

import com.windhike.library.HolderLayout;
import com.windhike.library.RecyclerHolder;

/**
 * Created by Administrator on 2016/10/7 0007.
 */
@HolderLayout(R.layout.holder_img)
public class ImageHolder extends RecyclerHolder<MainPresenter>{
    private ImageView mIvImg;
    public ImageHolder(View itemView) {
        super(itemView);
        mIvImg = (ImageView)itemView.findViewById(R.id.iv_img);
    }

    @Override
    public void bindView(int position, MainPresenter presenter) {
        super.bindView(position, presenter);
    }
}
