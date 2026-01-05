package com.zoo.staff;

import com.zoo.animals.Animal;
import com.zoo.care.Treatable;

public class Veterinarian implements Treatable {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    @Override
    public void treat(Animal animal) {
        System.out.println(name + " лечит " + animal.getName());
    }

    @Override
    public boolean checkHealth(Animal animal) {
        System.out.println(name + " проверяет здоровье " + animal.getName());
        return true;
    }

    public String getName() {
        return name;
    }
}

