package com.example.myapplication.interfaces;

import com.example.myapplication.base.BaseView;
import com.example.myapplication.bean.Bean;
import com.example.myapplication.net.INetCallBack;
import com.example.myapplication.net.INetWorkInterface;

public
interface IHome {
    interface IModel{
        <T> void getBannerData(String url, INetCallBack<T> callBack);
    }
    interface IPresenter{
        void transfer();
    }
    interface IView extends BaseView{
        void getBannerReturn(Bean bean);
    }
}
