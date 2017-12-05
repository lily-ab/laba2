package com.lab2;

public enum Size {
    TINY(3, 10),
    SMALL(10, 15),
    NORMAL(15, 20),
    BIG(20, 25),
    HUGE(35, 40);

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
