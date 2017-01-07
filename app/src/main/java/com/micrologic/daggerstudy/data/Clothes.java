package com.micrologic.daggerstudy.data;

/**
 * Created by micrologic on 17/1/1 15:58
 * email: laihl871@gmail.com
 */
public class Clothes {

    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "衣服";
    }
}
