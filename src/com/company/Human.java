package com.company;

import java.util.Date;

public class Human {
    public String fName;
    public String lName;
    private Double salary;


    Animal pet;

    Car myCar;

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
}
