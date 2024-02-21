package org.example.task8;

public class Atm {

    double conversionToRub;
    double conversionToDol;
    private static int counter;

    public Atm(double conversionToRub, double conversionToDol){
        counter++;
        if(conversionToRub > 0 && conversionToDol > 0) {
            this.conversionToRub = conversionToRub;
            this.conversionToDol = conversionToDol;
        } else
            System.out.println("Error");
    }

    public double convertToDol(double amount) {
        return amount * conversionToDol;
    }

    public double convertToRub(double amount){
        return amount * conversionToRub;
    }

    public static int getCounter(){
        return counter;
    }


    public static void main(String[] args) {

        Atm atm = new Atm(54.12, 65.30);
        System.out.println(atm.convertToRub(50));
        System.out.println(atm.convertToDol(20));
        System.out.println(getCounter());
        Atm atm2 = new Atm(12,15.2);
        System.out.println(getCounter());
    }


}
