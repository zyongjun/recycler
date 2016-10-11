package com.windhike.mvputils;

import com.windhike.recyclerutils.RecyclerPresenter;

public abstract class BaseRecyclerPresenter<T> extends RecyclerPresenter{
	public T mView;

	public void onResume() {

	}
	public void attach(T view){
		mView = view;
	}

	public void detach(){
		mView = null;
	}

	@Override
	public int getItemViewType(int position) {
		return 0;
	}

}
