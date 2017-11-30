package com.lab2;

import java.util.ArrayList;
import java.util.List;

class Cell <T extends Animal>{
    private T animal;
    private int price;
    private Size size;
    Cell(Size size){
        this.size=size;
        if(size==Size.TINY) price=20;
        if(size==Size.SMALL) price=30;
        if(size==Size.NORMAL) price=40;
        if(size==Size.BIG) price=50;
        if(size==Size.HUGE) price=60;
    }

    public void putAnimal(T animal){
        if(this.animal!=null){
            throw new IllegalArgumentException("Cell has an animal");
        }
        this.animal=animal;
    }

    public T getAnimal(){
        T an=animal;
        this.animal=null;
        return an;
    }

    public int getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }
}

