package com.lab2.Factory.AnimalFactory;

import com.lab2.Entity.Animals.Bear;
import com.lab2.Entity.Animals.Gender;

class BearCreator extends AnimalCreator{
    @Override
    public Bear create(String name, int gender) {
        if(gender==1){
            return new Bear(name, Gender.MALE);
        }
        if (gender==2){
            return new Bear(name,Gender.FEMALE);
        }
        return null;
    }
}
