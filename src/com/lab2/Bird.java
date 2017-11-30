package com.lab2;

public class Bird extends Animal {
    Bird() {
        super(Size.TINY, 25);
    }

    @Override
    public Size getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);
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
}
