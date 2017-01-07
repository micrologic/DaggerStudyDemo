package com.micrologic.daggerstudy.di.ioc.component;

import com.micrologic.daggerstudy.di.ioc.PerActivity;
import com.micrologic.daggerstudy.di.ioc.module.SecondModule;
import com.micrologic.daggerstudy.ui.activity.SecondActivity;

import dagger.Component;

/**
 * Created by micrologic on 17/1/7 16:56
 * email: laihl871@gmail.com
 */
@PerActivity
@Component(dependencies = BaseComponent.class,modules = SecondModule.class)
public interface SecondComponent {

    void inject(SecondActivity secondActivity);
}
