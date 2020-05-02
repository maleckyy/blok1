package com.company;

public class Animal {
    String species;
    private Double weight;

    public Animal() {

        this.species = species;
        this.weight = 10.0;
    }


    void feed(){
        weight++;
        System.out.println("psinka zjadła i waży"+" "+weight);
    }
    void takeForAWalk(){
        if(weight>1){
            weight--;
            System.out.println("spacer udany i ja psinka waże"+" "+weight);
        }else{
            System.out.println("ja pies nie żyje...");
        }
    }


}
