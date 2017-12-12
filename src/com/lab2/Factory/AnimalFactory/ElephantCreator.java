package com.lab2.Factory.AnimalFactory;

import com.lab2.Entity.Animals.Elephant;
import com.lab2.Entity.Animals.Gender;

class ElephantCreator extends AnimalCreator{
    @Override
    public Elephant create(String name, int gender) {
        if(gender==1){
            return new Elephant(name, Gender.MALE);
        }
        if (gender==2){
            return new Elephant(name,Gender.FEMALE);
        }
        return null;
    }
}
