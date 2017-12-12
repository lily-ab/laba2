package com.lab2.Entity.Animals;

import com.lab2.ConditionStrategy.Condition;
import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.ArrayList;
import java.util.List;

@NameAnnotation(name = "Crocodile")
public class Crocodile extends Animal {
    public Crocodile(String name, Gender gender) {
        super(name, gender, Size.NORMAL, 50, CellType.TERRARIUM, 10);
        List<CellType> types=new ArrayList<>();
        types.add(CellType.TERRARIUM);
        setAvailableListTypes(types);
    }
}
