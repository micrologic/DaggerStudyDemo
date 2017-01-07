package com.micrologic.daggerstudy.di.ioc.module;

import com.micrologic.daggerstudy.data.Cloth;
import com.micrologic.daggerstudy.di.ioc.BlueCloth;
import com.micrologic.daggerstudy.di.ioc.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by micrologic on 17/1/7 17:34
 * email: laihl871@gmail.com
 */
@Module
public class SecondModule {

    @Provides
    @BlueCloth
    @PerActivity
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;

    }
}
