package com.lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Cell {
    private Animal animal;
    private int price;
    private Size size;
    private CellType cellType;

    Cell(CellType cellType, Size size) {
        this.cellType = cellType;
        this.size = size;
        this.price = size.getPrice();
    }


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size.getSize();
    }

    public CellType getCellType() {
        return cellType;
    }

    @Override
    public String toString() {
        if (animal == null) {
            return cellType + " size - " + size;
        }
        return cellType + " size - " + size + " has an animal";
    }
}