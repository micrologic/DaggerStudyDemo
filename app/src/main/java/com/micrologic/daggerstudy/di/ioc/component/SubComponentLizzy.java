package com.micrologic.daggerstudy.di.ioc.component;

import com.micrologic.daggerstudy.di.ioc.PerActivity;
import com.micrologic.daggerstudy.di.ioc.module.MainModule;
import com.micrologic.daggerstudy.ui.activity.MainActivity;
import com.micrologic.daggerstudy.ui.activity.SubActivity;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by micrologic on 17/1/7 18:06
 * email: laihl871@gmail.com
 */
@PerActivity
@Subcomponent(modules = MainModule.class)
public interface SubComponentLizzy {
    void inject(SubActivity subActivity);
}
