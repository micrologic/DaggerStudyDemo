package com.micrologic.daggerstudy.di.ioc.module;

import com.micrologic.daggerstudy.di.ioc.BlueCloth;
import com.micrologic.daggerstudy.data.Cloth;
import com.micrologic.daggerstudy.data.Clothes;
import com.micrologic.daggerstudy.di.ioc.PerActivity;
import com.micrologic.daggerstudy.data.Shoe;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by micrologic on 17/1/1 15:08
 * email: laihl871@gmail.com
 */
@Module
public class MainModule {


    @Provides
    @PerActivity
    public Cloth getCloth() {
        Cloth cloth = new Cloth();

        cloth.setColor("红色");

        return cloth;
    }

    @Provides
    public Clothes getClothes(@BlueCloth Cloth cloth) {
        return new Clothes(cloth);
    }

    @Provides
    @BlueCloth
    @PerActivity
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

    @Provides
    @Named("black")
    public Cloth getBlackCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("黑色");
        return cloth;
    }




    @Provides
    public Shoe getShoe(){
        Shoe shoe = new Shoe();
        return  shoe;
    }



}
