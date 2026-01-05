package com.zoo.animals;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, "Лев", age);
    }

    @Override
    public String makeSound() {
        return "РРРРРРР";
    }

    @Override
    public String getFoodType() {
        return "Мясо";
    }
}

