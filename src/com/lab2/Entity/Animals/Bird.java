package com.lab2.Entity.Animals;

import com.lab2.ConditionStrategy.Condition;
import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.ArrayList;
import java.util.List;

@NameAnnotation(name = "Bird")
public class Bird extends Animal {
    public Bird(String name, Gender gender) {
        super(name, gender, Size.TINY, 25, CellType.BIRDCAGE, 3);
        List<CellType> types=new ArrayList<>();
        types.add(CellType.BIRDCAGE);
        types.add(CellType.AVIARY);
        setAvailableListTypes(types);
    }
}
