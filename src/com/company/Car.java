package com.company;

public class Car {
        String type ;
        double price;
        int number;
        int power;
        short created;
            public static void main(String[] args) {

                Car car1 = new Car();
                car1.created= 2000;
                car1.price=100000;
                car1.number=2525;
                car1.power=400;
                car1.type="BMW";


                System.out.println( "У вас : " + car1.type +" модель\n" +
                        "Цена машины:" + car1.price+ "сомов\n"+
                        "Год выпуска"+car1.created+
                        "");







            }

}
