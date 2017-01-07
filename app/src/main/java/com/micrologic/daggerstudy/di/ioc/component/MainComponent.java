package com.micrologic.daggerstudy.di.ioc.component;

import com.micrologic.daggerstudy.ui.activity.MainActivity;
import com.micrologic.daggerstudy.di.ioc.module.MainModule;
import com.micrologic.daggerstudy.di.ioc.PerActivity;

import dagger.Component;

/**
 * Created by micrologic on 17/1/1 15:23
 * email: laihl871@gmail.com
 */
@PerActivity
@Component(dependencies = BaseComponent.class,modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
