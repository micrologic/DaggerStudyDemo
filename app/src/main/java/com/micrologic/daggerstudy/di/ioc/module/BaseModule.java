package com.micrologic.daggerstudy.di.ioc.module;

import com.micrologic.daggerstudy.data.ClothHandler;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by micrologic on 17/1/7 16:49
 * email: laihl871@gmail.com
 */
@Module
public class BaseModule {

    @Provides
    @Singleton
    public ClothHandler getClothHandler() {
        return new ClothHandler();
    }

}
