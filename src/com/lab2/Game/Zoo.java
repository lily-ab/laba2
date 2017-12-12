package com.lab2.Game;

import com.lab2.Entity.Animals.Animal;
import com.lab2.ConditionStrategy.Condition;
import com.lab2.Entity.Animals.NameAnnotation;
import com.lab2.Entity.Cells.Cell;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;
import com.lab2.Factory.AnimalFactory.AnimalFactoryCreator;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int money;
    private int capacity;
    private final int paymentForService;
    private int profit;

    private List<Animal> animals = new ArrayList<>();
    private List<Cell> cells = new ArrayList<>();

    Zoo() {
        capacity = 100;
        money = 500;
        paymentForService = 25;
        profit = 50;
    }

    public void passDay() {
        money -= paymentForService;
        countProfit();
        money += profit;
    }

    public int getMoney() {
        return money;
    }

    public void showCells() {
        CellType[] cellTypes = CellType.values();
        Size[] sizes = Size.values();

        for (int i = 0; i < cellTypes.length; i++) {
            System.out.println("Types:");
            System.out.println((i + 1) + ") " + cellTypes[i]);
        }
        for (int i = 0; i < sizes.length; i++) {
            System.out.println("Sizes:");
            System.out.println(i + 1 + ") " + sizes[i] + "\n \t price - " +
                    +sizes[i].getPrice() + ";\n \t size - " + sizes[i].getSize() + ";");
        }
    }

    public void buyCell(int indexType, int indexSize) {
        CellType[] cellTypes = CellType.values();
        Size[] sizes = Size.values();
        CellType cellType = cellTypes[indexType];
        Size size = sizes[indexSize];
        System.out.println(addCell(cellType, size));
    }

    public String addCell(CellType cellType, Size size) {
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

    public String buyAnimal(String ch, String name, int gender) {
        AnimalFactoryCreator animalsFac = new AnimalFactoryCreator();
        Animal an = animalsFac.createAnimal(ch, name, gender);
        try {
            if (an.getPrice() > money) return "You don't have enough money";
            animals.add(an);
            money -= an.getPrice();
            return "Animal is bought";
        } catch (ClassCastException ex) {
            return "Wrong animal";
        }
    }

    public void getInfo() {
        System.out.println("Animals:");
        for (int i = 0; i < animals.size(); i++) {
            NameAnnotation an = animals.get(i).getClass().getAnnotation(NameAnnotation.class);
            if (animals.get(i).getCell() == null) {
                System.out.println(i + 1 + ") " + an.name() + animals.get(i).toString());
            } else {
                System.out.println(i + 1 + ")" + animals.get(i).toString() + " Cell: " + animals.get(i).getCell());
            }
        }
        System.out.println("Cells:");
        for (int i = 0; i < cells.size(); i++) {
            System.out.println(i + 1 + ") " + cells.get(i) + " " + cells.get(i).getSize());
        }
    }

    public void getZoo() {
        System.out.println("Zoo");
        System.out.println("Money - " + money);
        System.out.println("Free capacity - " + capacity);
        getInfo();
    }

    public String put(int animalInd, int cellInd) {
        if (cellInd < 0 || cellInd >= cells.size()) return "Wrong index";
        Cell cell = cells.get(cellInd);
        Animal animal = animals.get(animalInd);
        return cell.putAnimal(animal);
    }

    public String take(int animalInd) {
        if (animalInd < 0 || animalInd >= animals.size()) return "Wrong index";
        Animal animal = animals.get(animalInd);
        return animal.getCell().getOutOfCell(animalInd);
    }

    public void countProfit() {
        for (Animal animal : animals) {
            if (animal.getCondition() == Condition.AWFUL) profit -= 50;
            if (animal.getCondition() == Condition.BAD) profit -= 30;
            if (animal.getCondition() == Condition.NORMAL) profit += 10;
            if (animal.getCondition() == Condition.GOOD) profit += 50;
        }
    }


}
