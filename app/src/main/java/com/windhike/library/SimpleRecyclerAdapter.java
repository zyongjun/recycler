package com.windhike.library;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * Created by gzzyj on 2016/9/29.
 */
public abstract class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerHolder>{
    private SparseArray<Class<? extends SimpleRecyclerHolder>> mItemProviders = new SparseArray();

    @Override
    public SimpleRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Class<? extends SimpleRecyclerHolder> holderClass = mItemProviders.get(viewType);
        try {
            if (holderClass == null) {
                throw new RecyclerException("RecyclerHolder parser error," +
                        "please check if you had regist this type Holder");
            }
            HolderLayout layout = holderClass.getAnnotation(HolderLayout.class);
            if (layout == null) {
                throw new RecyclerException("RecyclerHolder parser error," +
                        "RecyclerHolder need a @HolderLayout annotion");
            }
            Class[] parameters = {View.class};
            Constructor constructor = mItemProviders.get(viewType).getConstructor(parameters);
            Object[] objects = {LayoutInflater.from(parent.getContext()).inflate(layout.value(),parent,false)};
            return (SimpleRecyclerHolder) constructor.newInstance(objects);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void registViewTemplate(int viewType,Class<? extends SimpleRecyclerHolder> holderClass) {
        mItemProviders.put(viewType,holderClass);
    }

    @Override
    public void onBindViewHolder(SimpleRecyclerHolder holder, int position) {
        holder.bindView(getItem(position));
    }

    protected abstract Object getItem(int position);

}
