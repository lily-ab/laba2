package com.lab2.Game;

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
                    System.out.println("Enter gender");
                    System.out.println(" 1 - Male; \n 2 - Female;");
                    int gender = s.nextInt();
                    System.out.println(zoo.buyAnimal(ch, name, gender));
                    break;
                case "4":
                    zoo.showCells();
                    try {
                        System.out.println("Enter number of type:");
                        int indexType = s.nextInt() - 1;
                        System.out.println("Enter number of size:");
                        int indexSize = s.nextInt() - 1;
                        zoo.buyCell(indexType, indexSize);
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Entered value is not a number");
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
                    System.out.println(zoo.put(animalInd, cellInd));
                    break;
                case "6":
                    // take
                    zoo.getInfo();
                    System.out.println("Enter the index of animal");
                    int animalInd1 = s.nextInt() - 1;
                    System.out.println(zoo.take(animalInd1));
                    break;
                case "7":
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            if (zoo.getMoney() < 0) {
                System.out.println("You're out of money!");
                break;
            }
        }


    }
}
