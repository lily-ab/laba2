package com.lab2.Entity.Animals;

import com.lab2.ConditionStrategy.Condition;
import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.ArrayList;
import java.util.List;

@NameAnnotation(name = "Monkey")
public class Monkey extends Animal {
    public Monkey(String name, Gender gender) {
        super(name, gender, Size.SMALL, 40, CellType.AVIARY, 7);
        List<CellType> types=new ArrayList<>();
        types.add(CellType.AVIARY);
        setAvailableListTypes(types);
    }
}
