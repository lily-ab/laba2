package com.lab2.ConditionStrategy;

import com.lab2.Entity.Animals.Animal;

class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getConditionStrategy(Animal animal, int value) {
        return strategy.getConditionValue(animal, value);
    }
}
