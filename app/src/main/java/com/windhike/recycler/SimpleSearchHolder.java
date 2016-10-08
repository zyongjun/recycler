package com.windhike.recycler;

import android.view.View;
import android.widget.EditText;

import com.windhike.recyclerutils.HolderLayout;
import com.windhike.recyclerutils.SimpleRecyclerHolder;

/**
 * Created by Administrator on 2016/10/7 0007.
 */
@HolderLayout(R.layout.holder_edittext)
public class SimpleSearchHolder extends SimpleRecyclerHolder {
    private EditText mEdit;
    public SimpleSearchHolder(View itemView) {
        super(itemView);
        mEdit = (EditText) itemView.findViewById(R.id.et_edit);
    }

    @Override
    public void bindView(Object object) {

    }
}
