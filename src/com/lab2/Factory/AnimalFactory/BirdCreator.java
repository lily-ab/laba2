package com.lab2.Factory.AnimalFactory;

import com.lab2.Entity.Animals.Bird;
import com.lab2.Entity.Animals.Gender;

class BirdCreator extends AnimalCreator{
    @Override
    public Bird create(String name, int gender) {
        if(gender==1){
            return new Bird(name, Gender.MALE);
        }
        return new Bird(name,Gender.FEMALE);
    }
}
