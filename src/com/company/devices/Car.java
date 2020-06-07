package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Salleable;

public abstract class Car extends Device {
    private String producer;
    private String model;
    private Double value;


    public String toString(){
        return producer+" "+model+" "+value;
    }

    @Override
    public boolean tunrOn() {
        System.out.println("samochod jest włączony");
        return true;
    }


    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if (buyer.getCash() >= price) {
                if (seller.getPet() == null) {
                    System.out.println("nie mam zwierzaka na sprzedanie");
                } else {
                    System.out.println("mam zwierzaka na sprzedarz");

                }
                if (seller.getMyCar() == null) {
                    System.out.println("nie mam samochodu na sprzedarz");
                } else {
                    System.out.println("mam samochod na sprzedarz");
                    buyer.setCash(-price);
                    buyer.setMyCar(seller.getMyCar());
                    seller.setCash(+price);
                }
                if (seller.getPhone() == null) {
                    System.out.println("nie mam telefonu na sprzedarz");

                } else {
                    System.out.println("mam telefon na sprzedasz");

                }
            } else {
                System.out.println("nie masz wystarczająco pieniedzy zeby cos kupic");
            }
        }
    };

    public abstract void refuel();


}
