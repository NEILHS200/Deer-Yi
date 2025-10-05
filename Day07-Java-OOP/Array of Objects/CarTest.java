package com.yde.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1. use 1 array to store 3 car objects
        Car[] arr = new Car[3];

        //2. Create new car object, data is from keyboard input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //create car objects
            Car c = new Car();
            //write brand info
            System.out.println("Please type the brand name: ");
            String name = sc.next();
            c.setBrand(name);

            // write car's price
            System.out.println("Please type the price of the car: ");
            int price = sc.nextInt();
            c.setPrice(price);

            //write car's color
            System.out.println("Please type the car's color: ");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            Car cars = arr[i];
            System.out.println(cars.getBrand() + ", $" + cars.getPrice() + ", " + cars.getColor());
        }
    }
}
