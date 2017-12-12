package com.lab2.ConditionStrategy;

import com.lab2.Entity.Animals.Animal;
import com.lab2.Entity.Cells.Cell;

class ConditionByGender implements Strategy{
    @Override
    public int getConditionValue(Animal animal, int value) {
        Cell cell=animal.getCell();
        int amount=cell.getAnimals().size();
        for(Animal an:cell.getAnimals()){
            if(an.getGender()!=animal.getGender()){
                if(amount==2){
                    value+=20;
                    return value;
                }
                value+=10;
                return value;
            }
        }
        return value;
    }
}
