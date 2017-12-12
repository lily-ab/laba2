package com.lab2.ConditionStrategy;

import com.lab2.Entity.Animals.Animal;

public interface Strategy {
    int getConditionValue(Animal animal, int value);
}
