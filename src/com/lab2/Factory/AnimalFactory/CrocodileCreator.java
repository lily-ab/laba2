package com.lab2.Factory.AnimalFactory;

import com.lab2.Entity.Animals.Crocodile;
import com.lab2.Entity.Animals.Gender;

class CrocodileCreator extends AnimalCreator{
    @Override
    public Crocodile create(String name, int gender) {
        if(gender==1){
            return new Crocodile(name, Gender.MALE);
        }
        if (gender==2){
            return new Crocodile(name,Gender.FEMALE);
        }
        return null;
    }
}
