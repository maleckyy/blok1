package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.util.*;

public class Human {
    public String fName;
    public String lName;
    private Double salary;
    private Double cash;
    public Animal pet;
    private Phone phone;
    private Car myCar;

    public String toString(){
        return fName+" "+lName+" "+salary;

    }
    private ArrayList garage=new ArrayList();


    public Human() {
    }


    public Double getSalary() {
       Date date= new Date();
       date.getTime();
       System.out.println(date+" "+salary);

       return salary;
    }

    public Double setSalary(Double salary) {
        this.salary = salary;
        if(salary>0){
            System.out.println("Kasa jest na koncie-wartosc dodatnia");
        }else{
            System.out.println("Dane zostały wysłane do systemu ksiegowego");
            System.out.println("Trzeba odebrać aneks od pani Hani");
            System.out.printf("ZUS i US juz wiedzą... nie kłam");

            return salary;
        }

        return salary;
    }

    public List addMyCar(Car myCar){
        getGarage().add(myCar);
        return getGarage();

    }

   public List sort(){
       Collections.sort(garage);

    return garage;
   }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }


    public ArrayList getGarage() {
        return garage;
    }

    public void setGarage(ArrayList garage) {
        this.garage = garage;
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        getGarage().add(1,myCar);
    }
}
