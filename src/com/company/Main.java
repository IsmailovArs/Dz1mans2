package com.company;

public class Main {
    public static void main(String[] args) {
        Hom hom = new Hom("Budka");
        Hom hom1 = new Hom("Budka2");
        Dog dog = new Dog(21, "BOBY", Color.RED, hom, 15);
        Breed breed = new Breed("Sharik", 12, Color.WHITE, hom, 2, 1000);
        Breed breed1 = new Breed("Rex", 5, Color.BLACK, hom1, 7, 7000);
        System.out.println(dog.printInfo());
        System.out.println(breed.printInfo());
        System.out.println(breed1.printInfo());
    }
}
