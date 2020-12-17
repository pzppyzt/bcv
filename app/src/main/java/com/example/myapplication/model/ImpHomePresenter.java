package com.example.myapplication.model;

import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.bean.Bean;
import com.example.myapplication.interfaces.IHome;
import com.example.myapplication.net.INetCallBack;
import com.example.myapplication.presenter.ImpHomeModel;

import static com.example.myapplication.net.URLConstant.BANNER;

public
class ImpHomePresenter extends BasePresenter<IHome.IView> implements IHome.IPresenter {
    private IHome.IModel model;

    public ImpHomePresenter(IHome.IView iView) {
        this.model =new ImpHomeModel(this);
    }

    @Override
    public void transfer() {
        model.getBannerData(BANNER, new INetCallBack<Bean>() {

            @Override
            public void onSuccess(Bean bean) {
                iview.getBannerReturn(bean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }
}
