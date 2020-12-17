package com.example.myapplication;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.bean.Bean;
import com.example.myapplication.interfaces.IHome;
import com.example.myapplication.model.ImpHomePresenter;

public class MainActivity extends BaseActivity<ImpHomePresenter> implements IHome.IView {
    private RecyclerView rcy;
    private Myadapter myadapter;

    @Override
    protected void initData() {
        presenter.transfer();
    }

    @Override
    protected void initView() {
        rcy=findViewById(R.id.rcy);
        rcy.setLayoutManager(new LinearLayoutManager(this));
        myadapter = new Myadapter(this);
        rcy.setAdapter(myadapter);
    }

    @Override
    protected ImpHomePresenter getPresenter() {
        return new ImpHomePresenter(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void getBannerReturn(Bean bean) {
    myadapter.Additem(bean.getData().getDatas());
    }
}