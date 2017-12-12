package com.lab2.Entity.Animals;

import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.ArrayList;
import java.util.List;

public class Elephant extends Animal {
    public Elephant(String name, Gender gender) {
        super(name, gender, Size.HUGE, 85, CellType.CORRAL, 35);
        List<CellType> types=new ArrayList<>();
        types.add(CellType.AVIARY);
        types.add(CellType.CORRAL);
        setAvailableListTypes(types);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public Condition getCondition() {
        return super.getCondition();
    }

    @Override
    public void setCondition(Condition condition) {
        super.setCondition(condition);
    }

    @Override
    public Cell getCell() {
        return super.getCell();
    }

    @Override
    public void setCell(Cell cell) {
        super.setCell(cell);
    }

    @Override
    public CellType getRequiredCellType() {
        return super.getRequiredCellType();
    }

    @Override
    public void setRequiredCellType(CellType requiredCellType) {
        super.setRequiredCellType(requiredCellType);
    }

    @Override
    public int getRequiredCellSize() {
        return super.getRequiredCellSize();
    }

    @Override
    public void setRequiredCellSize(int requiredCellSize) {
        super.setRequiredCellSize(requiredCellSize);
    }
}
