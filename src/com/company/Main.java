package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

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

        Phone myphone= new Phone();
        myphone.number="857798947";
        myphone.producer="huawei";

        Human human1= new Human();
        human1.fName="Patryk";
        human1.lName="Kupfer";
        human1.setSalary(3000.23D);

        Animal dog= new Animal();
        dog.petName="pies";
        human1.pet= dog;

        Car myCar= new Car();
        myCar.setModel("v40");
        myCar.setProducer("Volvo");
        myCar.setValue(12000D);
        human1.addCar(myCar);

        Car newCar=new Car();
        newCar.setModel("v60");
        newCar.setProducer("Volvo");
        newCar.setValue(18000.50D);
        boolean equal = newCar.getModel().equals(myCar.getModel())&& newCar.getProducer().equals(myCar.getProducer());
        System.out.println(equal);//porównanie czy są takie same, są false bo mają rozne wartosci w modelu


        Car newCar1=new Car();
        newCar1.setModel("v60");
        newCar1.setProducer("Volvo");
        newCar1.setValue(18000.50D);
        boolean equal1 = newCar1.getModel().equals(newCar.getModel())&& newCar1.getProducer().equals(newCar.getProducer());
        System.out.println(equal1);//true poniewaz są takie same

        System.out.println(newCar);
        System.out.println(newCar1);

        System.out.println(human1.toString());
        System.out.println(dog.toString());
        System.out.println(myphone.toString());
    }
}
