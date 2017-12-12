package com.lab2.Entity.Animals;

import com.lab2.ConditionStrategy.Condition;
import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.ArrayList;
import java.util.List;

@NameAnnotation(name = "Elephant")
public class Elephant extends Animal {
    public Elephant(String name, Gender gender) {
        super(name, gender, Size.HUGE, 85, CellType.CORRAL, 35);
        List<CellType> types=new ArrayList<>();
        types.add(CellType.AVIARY);
        types.add(CellType.CORRAL);
        setAvailableListTypes(types);
    }
}
