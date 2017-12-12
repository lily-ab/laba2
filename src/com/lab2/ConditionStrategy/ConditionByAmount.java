package com.lab2.ConditionStrategy;

import com.lab2.Entity.Animals.Animal;
import com.lab2.Entity.Cells.Cell;

class ConditionByAmount implements Strategy{
    @Override
    public int getConditionValue(Animal animal, int value) {
        Cell cell=animal.getCell();
        if(cell.getFreeSize()>=animal.getSize()){
            value+=15;
            return value;
        }
        value-=15;
        return value;
    }
}
