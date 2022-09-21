package com.company;

public class Dog extends Animal{


private int win;

    public int getWin() {
        return win;
    }

    public Dog(String name,int age,Color color, Hom hom,int win) {
        super(name,age,color,hom);
        this.win = win;


    }
   public Dog(int age,String name,Color color,Hom hom,int win){
       super(name,age,color,hom);
       this.win = win;

   }

   public final void Dog(int win){
        this.win=win;
   }

    @Override
    public String printInfo() {
        return super.printInfo() +  " " + getWin();
    }
}
