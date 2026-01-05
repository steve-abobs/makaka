package com.zoo.staff;

import com.zoo.animals.Animal;
import com.zoo.care.Feedable;

public class Keeper implements Feedable {
    private String name;

    public Keeper(String name) {
        this.name = name;
    }

    @Override
    public void feed(Animal animal) {
        System.out.println(name + " кормит " + animal.getName() + " этим: " + animal.getFoodType());
    }

    public String getName() {
        return name;
    }
}

