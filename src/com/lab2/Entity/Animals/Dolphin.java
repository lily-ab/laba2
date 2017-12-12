package com.lab2.Entity.Animals;

import com.lab2.ConditionStrategy.Condition;
import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.ArrayList;
import java.util.List;

public class Dolphin extends Animal {

    @NameAnnotation(name = "Dolphin")
    public Dolphin(String name, Gender gender) {
        super(name, gender, Size.NORMAL, 25, CellType.POOL, 15);
        List<CellType> types=new ArrayList<>();
        types.add(CellType.POOL);
        types.add(CellType.POND);
        types.add(CellType.AQUARIUM);
        setAvailableListTypes(types);
    }
}
