package com.lab2;

import com.lab2.Entity.Animals.*;
import com.lab2.Entity.Cells.CellType;
import com.lab2.Entity.Cells.Size;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo();
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Zoo!");
        System.out.println("1 - Display my zoo;");
        System.out.println("2 - Pass a day;");
        System.out.println("3 - Buy an animal;");
        System.out.println("4 - Buy a cell for animal;");
        System.out.println("5 - Put animal to the cell;");
        System.out.println("6 - Take animal from cell;");
        System.out.println("7 - Exit.");
        while (flag) {
            System.out.println("Your action:");
            String choice = s.next();
            switch (choice) {
                case "1":
                    zoo.getZoo();
                    break;
                case "2":
                    zoo.passDay();
                break;
                case "3":
                    System.out.println("Choose animal:");
                    System.out.println(" 1 - Bear; \n 2 - Bird; \n 3 - Crocodile; \n 4 - Dolphin; \n 5 - Elephant;" +
                            "\n 6 - Monkey;");
                    String ch = s.next();


                    System.out.println("Enter name");
                    String name = s.next();
                    Animal animal;
                    switch (ch) {
                        case "1":
                            animal = new Bear(name);
                            System.out.println(zoo.buyAnimal(animal));
                            break;
                        case "2":
                            animal = new Bird(name);
                            System.out.println(zoo.buyAnimal(animal));
                            break;
                        case "3":
                            animal = new Crocodile(name);
                            System.out.println(zoo.buyAnimal(animal));
                            break;
                        case "4":
                            animal = new Dolphin(name);
                            System.out.println(zoo.buyAnimal(animal));
                            break;
                        case "5":
                            animal = new Elephant(name);
                            System.out.println(zoo.buyAnimal(animal));
                            break;
                        case "6":
                            animal = new Monkey(name);
                            System.out.println(zoo.buyAnimal(animal));
                            break;
                        default:
                            System.out.println("Wrong number");
                    }
                    break;
                case "4":
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

                    try {
                        System.out.println("Enter number of type:");
                        int index = s.nextInt() - 1;
                        CellType cellType = cellTypes[index];
                        System.out.println("Enter number of size:");
                        index = s.nextInt() - 1;
                        Size size = sizes[index];
                        System.out.println(zoo.buyCell(cellType, size));
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Entered value is not a number");
                        break;
                    } catch (NullPointerException ex) {
                        System.out.println("Wrong number");
                        break;
                    }
                    break;
                case "5":
                    //put
                    zoo.getInfo();
                    System.out.println("Enter the index of animal");
                    int animalInd = s.nextInt() - 1;
                    System.out.println("Enter the index of cell");
                    int cellInd = s.nextInt() - 1;
                    System.out.println(zoo.putAnimal(animalInd, cellInd));
                    break;
                case "6":
                    // take
                    zoo.getInfo();
                    System.out.println("Enter the index of animal");
                    int animalInd1 = s.nextInt() - 1;
                    System.out.println(zoo.getOutOfCell(animalInd1));
                    break;
                case "7":
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            if(zoo.getMoney()<0){
                System.out.println("You're out of money!");
                break;
            }
        }


    }
}
