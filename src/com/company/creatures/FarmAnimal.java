package com.company.creatures;

public abstract class FarmAnimal extends Animal implements Edible{

    String species="pies";
    private Double weight;

    public FarmAnimal(String species,Double weight) {
        super();
    }

    @Override
    public void beEaten() {

    }


}
