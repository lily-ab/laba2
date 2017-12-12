package com.lab2.Entity.Cells;

import com.lab2.ConditionStrategy.AnimalCondition;
import com.lab2.Entity.Animals.Animal;

import java.util.ArrayList;
import java.util.List;


public class Cell {
    private List<Animal> animals = new ArrayList<>();
    private int price;
    private Size size;
    private CellType cellType;

    public Cell(CellType cellType, Size size) {
        this.cellType = cellType;
        this.size = size;
        this.price = size.getPrice();
    }

    public String putAnimal(Animal animal) {
        if (animal.getCell() != null) {
            return "Animal is already in the cell";
        }
        if (!animal.getAvailableListTypes().contains(cellType)) {
            return "Animal and cell are incompatible";
        }
        if (getFreeSize() < animal.getSize()) {
            return "Cell is full. Animal is not placed";
        }
        for (Animal inhabitan : animals) {
            if (inhabitan.getClass() != animal.getClass()) {
                return "Cell has other types of animals";
            }
        }
        animals.add(animal);
        animal.setCell(this);
        AnimalCondition cond = new AnimalCondition();
        animal.setCondition(cond.getCondition(animal));
        return "Animal is placed successfully";
    }

    public String getOutOfCell(int animalInd) {
        if (animalInd < 0 || animalInd >= animals.size()) return "Wrong index";
        Animal animal = animals.get(animalInd);
        if (animals.get(animalInd) == null) {
            return "Cell doesn't contain this animal";
        }
        animal.setCell(null);
        animals.remove(animal);
        return "You pulled animal from the cell";
    }

    public int getFreeSize() {
        int occupied = 0;
        if (animals.size() == 0) return size.getSize();
        for (Animal animal : animals) {
            occupied += animal.getSize();
        }
        return size.getSize() - occupied;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
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
        if (animals.size() == 0) {
            return cellType + " size - " + size;
        }
        return cellType + " size - " + size + " has an animal";
    }
}