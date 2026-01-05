package com.zoo.staff;

import com.zoo.animals.Animal;
import com.zoo.care.Cleanable;

public class Cleaner implements Cleanable {
    private String name;

    public Cleaner(String name) {
        this.name = name;
    }

    @Override
    public void clean(Animal animal) {
        System.out.println(name + " убирает " + animal.getName());
    }

    public String getName() {
        return name;
    }
}

