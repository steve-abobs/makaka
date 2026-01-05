package com.zoo.animals;

public class Snake extends Animal {
    public Snake(String name, int age) {
        super(name, "Змея", age);
    }

    @Override
    public String makeSound() {
        return "ССССССС";
    }

    @Override
    public String getFoodType() {
        return "Слон";
    }
}

