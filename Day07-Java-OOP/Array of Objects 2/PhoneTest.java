package com.yde.test5;

public class PhoneTest {
    public static void main(String[] args) {
        //1. create a new array
        Phone[] arr = new Phone[3];

        //2. Create 3 objects
        Phone p1 = new Phone("iPhone", 6000, "Black");
        Phone p2 = new Phone("Xiaomi",7000, "White");
        Phone p3 = new Phone("HuaWei", 5000, "Blue");

        //3. Add objects to array
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4. To Calculate the average price of 3 phones
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        int averagePrice = sum / arr.length;
        System.out.println(averagePrice);

        //5. To find which phone is lower than the avg price
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            if(phone.getPrice() < averagePrice){
                System.out.println(phone.getBrand());
            }
        }
    }
}
