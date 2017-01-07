package com.micrologic.daggerstudy;

import android.app.Application;

import com.micrologic.daggerstudy.di.ioc.component.BaseComponent;
import com.micrologic.daggerstudy.di.ioc.component.DaggerBaseComponent;
import com.micrologic.daggerstudy.di.ioc.module.BaseModule;

/**
 * Created by micrologic on 17/1/7 17:17
 * email: laihl871@gmail.com
 */
public class MyApplication extends Application {

    private BaseComponent baseComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }
}


