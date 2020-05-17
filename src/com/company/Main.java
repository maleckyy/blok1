package com.company;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.petName = "pies";



        Animal animal = new Animal();
        animal.petName="kotek";
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

        Phone myphone = new Phone();
        myphone.number = "857798947";
        myphone.producer = "huawei";

        Phone phone1 = new Phone();
        phone1.number = "213123543";
        phone1.producer = "samsung";
        phone1.model="galaxy";

        Human human1 = new Human();
        human1.fName = "Patryk";
        human1.lName = "Kupfer";
        human1.setSalary(3000.23D);
        human1.setPet(animal);
        human1.setPhone(myphone);
        human1.setCash(900.0);

        Human human2 = new Human();
        human2.fName = "Patryk2";
        human2.lName = "Kupfer2";
        human2.setSalary(32300.23D);
        human2.setPet(dog);
        human2.setPhone(phone1);
        human2.setCash(3000.22);



        Car myCar = new Car();
        myCar.setModel("v40");
        myCar.setProducer("Volvo");
        myCar.setValue(12000D);
        human1.addCar(myCar);

        Car newCar = new Car();
        newCar.setModel("v60");
        newCar.setProducer("Volvo");
        newCar.setValue(18000.50D);

        boolean equal = newCar.getModel().equals(myCar.getModel()) && newCar.getProducer().equals(myCar.getProducer());
        System.out.println(equal);//porównanie czy są takie same, są false bo mają rozne wartosci w modelu


        Car newCar1 = new Car();
        newCar1.setModel("v60");
        newCar1.setProducer("Volvo");
        newCar1.setValue(18000.50D);
        boolean equal1 = newCar1.getModel().equals(newCar.getModel()) && newCar1.getProducer().equals(newCar.getProducer());
        System.out.println(equal1);//true poniewaz są takie same

        System.out.println(newCar);
        System.out.println(newCar1);

        System.out.println(human1.toString());
        System.out.println(dog.toString());
        System.out.println(myphone.toString());




        Device device = new Device() {

            @Override
            public boolean tunrOn() {
                System.out.println("włączone");
                return true;
            }

        };
        device.tunrOn();
        System.out.println(device.toString());





        animal.salleable.sell(human1,human2,200.0);
        dog.salleable.sell(human2,human1,400.0);


    }
}