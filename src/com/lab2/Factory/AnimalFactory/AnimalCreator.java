package com.lab2.Factory.AnimalFactory;

import com.lab2.Entity.Animals.Animal;

abstract class AnimalCreator <T extends Animal>{
    public abstract T create(String s, int gender);
}
