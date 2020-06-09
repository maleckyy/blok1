package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Salleable;

import java.net.URL;
import java.text.Collator;
import java.util.Collections;
import java.util.List;

public class Phone extends Device{
    public String number;
    public String producer;

    public static final String appName="twarzksiega";
    public static final String appVersion="2.0";
    public static final String appServerAddress="1000";
    public Application application;
    public List<Application> applicationsList;
    public URL url;
    public Human human1;



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
    public void newAppIns(){
        if(human1.getCash()>application.getPrice()){
            applicationsList.add(application);
            human1.setCash(-application.getPrice());
        }
    }
    public void zainstalowane(Application application1){
        if(application1.equals(application)){
            System.out.println("juz zainstaloweane");
        }else{
            System.out.println("niezainstalowne");
        }

    }
    public void applicationsValue(){

        double aValue;
        for(int i=0;i<applicationsList.size();i++){

            aValue=+ applicationsList.get(i).getPrice();
            System.out.println(aValue);
        }
    }
    public void applicationsSortAbfabet(){
        Collections.sort(applicationsList, Collator.getInstance());
    }

}
