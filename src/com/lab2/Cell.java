package com.lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Cell {
    private Animal animal;
    private int price;
    private Size size;
    private CellType cellType;
    Cell(CellType cellType, Size size){
        this.cellType=cellType;
        this.size=size;
        this.price=size.getPrice();
    }

    public String putAnimal(Animal animal){
        if(this.animal!=null){
            return "Cell already has an animal";
        }
        if(this.size.getSize()<animal.getSize()){
            return "The cell is too small for it";
        }
        this.animal=animal;
        return "Animal is placed successfully";
    }

    public Animal getAnimal(){
        Animal an=animal;
        this.animal=null;
        return an;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size.getSize();
    }
}

enum CellType{
    AVIARY,
    AQUARIUM,
    TERRARIUM,
    BIRDCAGE,
    STABLE
}

enum Size{

    TINY(3,10),
    SMALL(10,15),
    NORMAL(15,20),
    BUG(20,25),
    HUGE(35,40);

    private int price;
    private int size;

    Size(int size, int price) {
        this.price=price;
        this.size=size;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}