package com.lab2;

public class Monkey extends Animal {
    Monkey(String name) {

        super(name, Size.SMALL, 40, CellType.AVIARY, 7);
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
