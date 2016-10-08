package com.windhike.recycler;

import android.view.View;
import android.widget.EditText;

import com.windhike.recyclerutils.HolderLayout;
import com.windhike.recyclerutils.RecyclerHolder;

/**
 * Created by Administrator on 2016/10/7 0007.
 */
@HolderLayout(R.layout.holder_edittext)
public class SearchHolder extends RecyclerHolder<MainPresenter> {
    private EditText mEdit;
    public SearchHolder(View itemView) {
        super(itemView);
        mEdit = (EditText) itemView.findViewById(R.id.et_edit);
    }

    @Override
    public void bindView(int position, MainPresenter presenter) {
        super.bindView(position, presenter);
    }
}
