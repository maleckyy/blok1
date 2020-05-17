package com.company;

public class Animal {
    String species;
    private Double weight;
    public String petName;

    public String toString(){

        return petName+" "+weight;

    }

    public Animal() {

        this.species = species;
        this.weight = 10.0;
    }


    void feed(){
        weight++;
        System.out.println("psinka zjadła i waży"+" "+weight);
    }
    void takeForAWalk(){
        if(weight>1){
            weight--;
            System.out.println("spacer udany i ja psinka waże"+" "+weight);
        }else{
            System.out.println("ja pies nie żyje...");
        }
    }


    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price){
                if(seller.getPet()==null){
                    System.out.println("nie mam zwierzaka na sprzedanie");
                }else{
                    System.out.println("mam zwierzaka na sprzedarz");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }
                if(seller.getMyCar()==null){
                    System.out.println("nie mam samochodu na sprzedarz");
                }else {
                    System.out.println("mam samochod na sprzedarz");
                   ;
                }
                if(seller.getPhone()==null){
                    System.out.println("nie mam telefonu na sprzedarz");

                }else{
                    System.out.println("mam telefon na sprzedasz");

                }
            }else{
                System.out.println("nie masz wystarczająco pieniedzy zeby cos kupic");
            }


        }
    };
}
