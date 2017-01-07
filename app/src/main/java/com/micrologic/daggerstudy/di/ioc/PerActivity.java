package com.micrologic.daggerstudy.di.ioc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by micrologic on 17/1/1 17:25
 * email: laihl871@gmail.com
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
