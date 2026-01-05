package com.zoo.care;

import com.zoo.animals.Animal;

public interface Treatable {
    void treat(Animal animal);
    boolean checkHealth(Animal animal);
}

