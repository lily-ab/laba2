package com.lab2;

public enum Size {
    TINY (1),
    SMALL(2),
    NORMAL(3),
    BIG(4),
    HUGE(5);

    private int i;
    Size(int i) {
        this.i=i;
    }

    public int getI(){
        return i;
    }
}
