package com.lab2;

abstract class Animal {
    private String name;
    private int size;
    private int price;
    private Cell cell;
    private Condition condition;
    private CellType requiredCellType;
    private int requiredCellSize;

    Animal(String name, int size, int price, CellType requiredCellType, int requiredCellSize) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.condition = Condition.NORMAL;
        this.cell = null;
        this.requiredCellType = requiredCellType;
        this.requiredCellSize = requiredCellSize;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
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
}

