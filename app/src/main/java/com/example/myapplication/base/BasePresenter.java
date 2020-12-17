package com.example.myapplication.base;

public
class BasePresenter<V extends BaseView> {
    public V iview;
    public void attach(V v){
        iview=v;
    }
}
