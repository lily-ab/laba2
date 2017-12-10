package com.lab2.Entity.Animals;

import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.List;

public abstract class Animal {
    private String name;
    private Size size;
    private int price;
    private Cell cell;
    private Condition condition;
    private CellType requiredCellType;
    private int requiredCellSize;
    private List availableListTypes;

    Animal(String name, Size size, int price, CellType requiredCellType, int requiredCellSize, List<CellType> availableListTypes) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.condition = Condition.NORMAL;
        this.cell = null;
        this.requiredCellType = requiredCellType;
        this.requiredCellSize = requiredCellSize;
        this.availableListTypes=availableListTypes;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.name + " MOOD IS " + getCondition();
    }

    public int getSize() {
        return size.getSize();
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public CellType getRequiredCellType() {
        return requiredCellType;
    }

    public void setRequiredCellType(CellType requiredCellType) {
        this.requiredCellType = requiredCellType;
    }

    public int getRequiredCellSize() {
        return requiredCellSize;
    }

    public void setRequiredCellSize(int requiredCellSize) {
        this.requiredCellSize = requiredCellSize;
    }

    public List getAvailableListTypes() {
        return availableListTypes;
    }
}

