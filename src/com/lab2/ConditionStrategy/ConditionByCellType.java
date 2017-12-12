package com.lab2.ConditionStrategy;

import com.lab2.Entity.Animals.Animal;
import com.lab2.Entity.Cells.Cell;

class ConditionByCellType implements Strategy{
    @Override
    public int getConditionValue(Animal animal, int value) {
        Cell cell=animal.getCell();
        if(cell.getCellType()==animal.getRequiredCellType()){
            value+=10;
        }
        return value;
    }
}
