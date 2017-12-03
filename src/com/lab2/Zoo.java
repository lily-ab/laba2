package com.lab2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int money;
    private int capacity;
    Zoo(){
        capacity=100;
        money=500;
    }

    List<Animal> animals=new ArrayList<>();
    List<Cell> cells=new ArrayList<>();


    public void getCellsList(){

        Field[] cellTypes=CellType.class.getDeclaredFields();

        for(int i=0;i<cellTypes.length-1;i++){
            System.out.println((i+1)+") "+cellTypes[i].getName());
        }
    }

    public String  buyCell(CellType cellType, Size size){
        try {
            cells.add(new Cell(cellType,size));
            return cellType+" is bought";
        }
        catch (IllegalArgumentException ex){
            return "Wrong parameters";
        }
    }

    public String buyAnimal(Animal an){
        try{
            animals.add(an);
            return "Animal is bought";
        }
        catch (ClassCastException ex){
            return "Wrong animal";
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void getInfo(){
        for(Animal an:animals){
            if(an.getCell()==null){
                System.out.println(an.toString());
            }
            System.out.println(an.toString());
        }
    }
}
