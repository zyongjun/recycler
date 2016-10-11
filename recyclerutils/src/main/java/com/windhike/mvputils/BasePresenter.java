package com.windhike.mvputils;

public abstract class BasePresenter<T> {
	public T mView;

	public void onResume() {

	}
	public void attach(T view){
		mView = view;
	}

	public void detach(){
		mView = null;
	}
	
}
