package com.micrologic.daggerstudy.data;

/**
 * Created by micrologic on 17/1/1 15:06
 * email: laihl871@gmail.com
 */
public class Cloth {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "布料";
    }
}
