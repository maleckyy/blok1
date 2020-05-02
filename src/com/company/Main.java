package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.feed();
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();

        Human human1= new Human();
        human1.fName="Patryk";
        human1.lName="Kupfer";

        animal.petName="psikoks";

        Car myCar= new Car();
        myCar.model="v40";
        myCar.producer ="Volvo";
        human1.addCar(myCar);


    }
}
