package com.lab2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ZooImple zoo=new ZooImple();
        zoo.animals.add(new Elephant());
        zoo.cells.add(new Cell(Size.HUGE));
        Cell cell=new Cell(Size.HUGE);
        cell.putAnimal(new Elephant());

        System.out.println();
//        while (zoo.getMoney()>0){
//
//        }
    }
}
