package com.lab2.Factory.AnimalFactory;

import com.lab2.Entity.Animals.Gender;
import com.lab2.Entity.Animals.Monkey;

class MonkeyCreator extends AnimalCreator{
    @Override
    public Monkey create(String name, int gender) {
        if(gender==1){
            return new Monkey(name, Gender.MALE);
        }
        if (gender==2){
            return new Monkey(name,Gender.FEMALE);
        }
        return null;
    }
}
