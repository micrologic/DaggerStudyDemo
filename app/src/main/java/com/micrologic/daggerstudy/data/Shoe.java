package com.micrologic.daggerstudy.data;

import com.micrologic.daggerstudy.di.ioc.PerActivity;

import javax.inject.Inject;

/**
 * Created by micrologic on 17/1/1 15:53
 * email: laihl871@gmail.com
 */
@PerActivity
public class Shoe {

    private String brand;

    @Inject
    public Shoe() {

    }

    @Override
    public String toString() {
        return "鞋子";
    }
}
