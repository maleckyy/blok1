package com.company.devices;

public class Phone extends Device{
    public String number;
    public String producer;

    public String toString(){
        return producer+" o numerze "+number;
    }

    @Override
    public boolean tunrOn() {
        System.out.println("telefon jest włączony");
        return true;
    }
}
