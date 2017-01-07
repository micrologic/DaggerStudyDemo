package com.micrologic.daggerstudy.di.ioc.component;

import com.micrologic.daggerstudy.data.ClothHandler;
import com.micrologic.daggerstudy.di.ioc.module.BaseModule;
import com.micrologic.daggerstudy.di.ioc.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by micrologic on 17/1/7 16:53
 * email: laihl871@gmail.com
 */
@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandler();

    SubComponentLizzy getSubComponentLizzy(MainModule mainModule);
}
