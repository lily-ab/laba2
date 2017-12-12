package com.lab2.Entity.Cells;

public enum Size {
    TINY(3, 10),
    SMALL(10, 15),
    NORMAL(20, 20),
    BIG(30, 25),
    HUGE(65, 40);

    private int price;
    private int size;

    Size(int size, int price) {
        this.price = price;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}
