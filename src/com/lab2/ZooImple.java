package com.lab2;

import java.util.ArrayList;
import java.util.List;

public class ZooImple implements Zoo{
    private int money;
    private int income;
    private Animal animal;
    ZooImple(){
        money=500;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    List<Cell> cells=new ArrayList<>();

    List<Animal> animals=new ArrayList<>();


    @Override
    public<T extends Animal> String buyAnimal(T t) {
        if(t.getPrice()<=money){
            animals.add(t);
            money-=t.getPrice();
            return "Animal is bought";
        }
        else{
            return "Not enough money";
        }
    }

    @Override
    public String byCell(int i) {
        Cell c;
        switch (i) {
            case (1):
                c = new Cell(Size.TINY);
                break;
            case (2):
                c = new Cell(Size.SMALL);
                break;
            case (3):
                c = new Cell(Size.NORMAL);
                break;
            case (4):
                c = new Cell(Size.BIG);
                break;
            case (5):
                c = new Cell(Size.HUGE);
                break;
            default:
                return "Wrong number";
        }
        if(c.getPrice()<=money){
            cells.add(c);
            money-=c.getPrice();
        }
        else {
            return "Not enough money";
        }
        return "Cell is bought";
    }

    @Override
    public void putToCell(Animal animal, Cell cell) {
        cell.putAnimal(animal);
        animals.remove(animals.indexOf(animal));
        if(animal.getSize().getI() <= cell.getSize().getI()){
            money+=50;
        }
        else{
            money-=100;
        }
    }

    @Override
    public void takeFromCell(Animal animal, Cell cell) {
        cell.getAnimal();
    }
}
