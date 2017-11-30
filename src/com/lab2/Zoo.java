package com.lab2;

public interface Zoo {
    <T extends Animal> String buyAnimal(T t);
    String byCell(int i);
    void putToCell(Animal animal, Cell cell);
    void takeFromCell(Animal animal, Cell cell);
}
