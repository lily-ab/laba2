package com.lab2.Factory.AnimalFactory;

import com.lab2.Entity.Animals.Dolphin;
import com.lab2.Entity.Animals.Gender;

class DolphinCreator extends AnimalCreator{
    @Override
    public Dolphin create(String name, int gender) {
        if(gender==1){
            return new Dolphin(name, Gender.MALE);
        }
        if (gender==2){
            return new Dolphin(name,Gender.FEMALE);
        }
        return null;
    }
}
