package com.zoo.animals;

public class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, "Попугай", age);
    }

    @Override
    public String makeSound() {
        return "КРя";
    }

    @Override
    public String getFoodType() {
        return "Семечки";
    }
}

