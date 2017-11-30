package com.lab2;

public class Player {
    private int id;
    private String name;
    private int money;
    static int idInc=0;
    public Player(String name) {
        id=++idInc;
        this.name = name;
        money=500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
