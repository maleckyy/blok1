package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Salleable;

import java.net.URL;
import java.util.List;

public class Phone extends Device{
    public String number;
    public String producer;

    public static final String appName="twarzksiega";
    public static final String appVersion="2.0";
    public static final String appServerAddress="1000";
    public List<String> appList;
    public URL url;


    public String toString(){
        return producer+" o numerze "+number;
    }

    @Override
    public boolean tunrOn() {
        System.out.println("telefon jest włączony");
        return true;
    }
    Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price){
                if(seller.getPet()==null){
                    System.out.println("nie mam zwierzaka na sprzedanie");
                }else{
                    System.out.println("mam zwierzaka na sprzedarz");

                }
                if(seller.getMyCar()==null){
                    System.out.println("nie mam samochodu na sprzedarz");
                }else {
                    System.out.println("mam samochod na sprzedarz");

                }
                if(seller.getPhone()==null){
                    System.out.println("nie mam telefonu na sprzedarz");

                }else{
                    System.out.println("mam telefon na sprzedasz");
                    buyer.setCash(-price);
                    buyer.setPhone(seller.getPhone());
                    seller.setCash(+price);
                }
            }else{
                System.out.println("nie masz wystarczająco pieniedzy zeby cos kupic");
            }
        }
    };
}
