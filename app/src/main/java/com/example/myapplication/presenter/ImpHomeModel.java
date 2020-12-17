package com.example.myapplication.presenter;

import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.interfaces.IHome;
import com.example.myapplication.net.INetCallBack;
import com.example.myapplication.utils.RetrofitUtils;

public
class ImpHomeModel extends BasePresenter implements IHome.IModel {

    private IHome.IPresenter presenter;

    public ImpHomeModel(IHome.IPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getBannerData(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getInstance().get(url,callBack);
    }
}
