package com.lab2.Entity.Animals;

import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.ArrayList;
import java.util.List;

@NameAnnotation(name = "Bear")
public class Bear extends Animal {
    public Bear(String name, Gender gender) {
        super(name, gender, Size.BIG, 60, CellType.AVIARY, 20);
        List<CellType> types=new ArrayList<>();
        types.add(CellType.AVIARY);
        setAvailableListTypes(types);
    }
}
