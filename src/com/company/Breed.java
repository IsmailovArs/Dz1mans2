package com.company;

public final class Breed extends Dog{
    private int price;

    public int getPrice() {
        return price;
    }

    public Breed(String name , int age, Color color, Hom hom,int win ,int price) {
        super(name,age, color, hom, win);
        this.price = price;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " " + getPrice();
    }
}
