package com.windhike.library;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;

/**
 * Created by gzzyj on 2016/8/25.
 */
public abstract class RecyclerPresenter{
    private SparseArray<Class<RecyclerHolder>> mItemProviders = new SparseArray();
    public abstract int getItemViewType(int position);
    public abstract int getItemCount();

    public RecyclerHolder createHolder(ViewGroup parent,int viewType){
        Class<RecyclerHolder> holderClass = mItemProviders.get(viewType);
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
            return (RecyclerHolder) constructor.newInstance(objects);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    protected void registViewTemplate(int viewType,Class<RecyclerHolder> holderClass) {
        mItemProviders.put(viewType,holderClass);
    }

}
