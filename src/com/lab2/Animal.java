package com.lab2;

abstract class Animal {
    private Size size;
    private int price;
    private Cell cell;
    private Condition condition;

    Animal(Size size, int price){
        this.size=size;
        this.price=price;
        this.condition=Condition.NORMAL;
        this.cell=null;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Cell getCell(){
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    //    private static List<Animal> animals=new ArrayList<>();
//    static{
//        animals.add(new Animal(ELEPHANT, HUGE, 75));
//        animals.add(new Animal(BIRD, TINY, 25));
//        animals.add(new Animal(CROCODILE, NORMAL, 50));
//        animals.add(new Animal(BEAR, BIG, 60));
//        animals.add(new Animal(MONKEY, BIG, 60));
//    }

}

