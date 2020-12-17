package com.example.myapplication.net;

public interface INetCallBack<T> {
    public void onSuccess(T t);
    public void onFail(String err);
}
