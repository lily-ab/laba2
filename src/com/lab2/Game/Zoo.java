package com.lab2.Game;

import com.lab2.Entity.Animals.Animal;
import com.lab2.Entity.Animals.Condition;
import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int money;
    private int capacity;
    private final int PAYMENTFORSERVICE;
    private int profit;

    Zoo() {
        capacity = 100;
        money = 500;
        PAYMENTFORSERVICE = 25;
        profit=50;
    }

    List<Animal> animals = new ArrayList<>();
    List<Cell> cells = new ArrayList<>();

    public void passDay(){
        money-=PAYMENTFORSERVICE;
        money+=profit;
    }


    public int getMoney() {
        return money;
    }

    public String buyCell(CellType cellType, Size size) {
        try {
            Cell newCell = new Cell(cellType, size);
            if (newCell.getSize() > capacity) return "The cell won't fit in your zoo";
            if (newCell.getPrice() > money) return "You don't have enough money";
            cells.add(newCell);
            money -= newCell.getPrice();
            capacity -= newCell.getSize();
            return cellType + " is bought";
        } catch (IllegalArgumentException ex) {
            return "Wrong parameters";
        }
    }

    public String buyAnimal(Animal an) {
        try {
            if (an.getPrice() > money) return "You don't have enough money";
            animals.add(an);
            money -= an.getPrice();
            return "Animal is bought";
        } catch (ClassCastException ex) {
            return "Wrong animal";
        }
        catch (NullPointerException ex) {
            return "Animal wasn't chosen";
        }
    }


    public void getInfo() {
        System.out.println("Animals:");
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getCell() == null) {
                System.out.println(i + 1 + ") " + animals.get(i).toString());
            } else {
                System.out.println(i + 1 + ")" + animals.get(i).toString() + " Cell: " + animals.get(i).getCell());
            }
        }
        System.out.println("Cells:");
        for (int i = 0; i < cells.size(); i++) {
            System.out.println(i + 1 + ") " + cells.get(i) + " " + cells.get(i).getSize());
        }
    }

    public void getZoo(){
        System.out.println("Zoo");
        System.out.println("Money - "+money);
        System.out.println("Free capacity - "+capacity);
        getInfo();
    }

    public String putAnimal(int animalInd, int cellInd) {
        if (animalInd < 0 || animalInd >= animals.size()) return "Wrong index";
        if (cellInd < 0 || cellInd >= cells.size()) return "Wrong index";
        Animal animal = animals.get(animalInd);
        Cell cell = cells.get(cellInd);
        if (cell.getAnimal() != null) {
            return "Cell already has an animal";
        }
        if (cell.getSize() < animal.getSize()) {
            return "The cell is too small for it";
        }
        cell.setAnimal(animal);
        animal.setCell(cell);
        Condition cond=checkCondition(animal);
        if(cond==Condition.GOOD) profit+=50;
        if(cond==Condition.BAD) profit-=50;
        return "Animal is placed successfully";
    }

    public Condition checkCondition(Animal animal){
        if(animal.getCell().getCellType()==animal.getRequiredCellType()){
            if(animal.getSize()==animal.getCell().getSize()){
                animal.setCondition(Condition.GOOD);
                return Condition.GOOD;
            }
            animal.setCondition(Condition.NORMAL);
            return Condition.NORMAL;
        }
        animal.setCondition(Condition.BAD);
        return Condition.BAD;
    }

    public String getOutOfCell(int animalInd) {
        if (animalInd < 0 || animalInd >= animals.size()) return "Wrong index";
        Animal animal = animals.get(animalInd);
        Cell cell = animal.getCell();
        if (cell.getAnimal() == null) {
            return "Cell is already empty";
        }
        animal.setCell(null);
        cell.setAnimal(null);
        return "You pulled animal from the cell";
    }
}