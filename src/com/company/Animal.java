package com.company;

public abstract class Animal {
 ;  private String name;
    private int age;
    private Color color;
    private  Hom hom;

    public Animal( String name,int age,Color color, Hom hom) {
        this.name = name;
        this.hom = hom;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Hom getHom() {
        return hom;
    }

    public Color getColor() {
        return color;
    }

   public String printInfo(){
        return  (getName() + " " + getAge()  +  " " + getColor() +  " "+getHom().getHom());
    }
}





