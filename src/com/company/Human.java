package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {
    public String fName;
    public String lName;
    private Double salary;
    private Double cash;
    private Animal pet;
    private Phone phone;

    public String toString(){
        return fName+" "+lName+" "+salary;

    }
    private Car myCar;
    public Human() {
    }

    void addCar(Car myCar){
        this.myCar=myCar;
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

    public Car getMyCar() {
        return myCar;
    }
    public void setMyCar(Car myCar){
        if (salary> myCar.getValue()){
            System.out.printf("Kupiłes samochod za gotóweczke");
            addCar(myCar);
        }
        else if(salary *12 > myCar.getValue()){
            System.out.printf("Kupiłeś samochod ale masz kredyt");
        }else{
            System.out.println("zapisz sie na studia ale znajdz lepsza prace");
        }

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
}
