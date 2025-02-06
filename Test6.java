package com.yde;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //Goal: divide lucky money in random amounts.
        int[] moneys = {9, 666, 188, 520, 99999};
        start(moneys);
    }

    public static void start(int[] moneys){
        // moneys = [9, 666, 188, 520, 99999]
        //           0   1    2    3     4

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //1. define a for loop(5 times)
        for(int i = 1; i <= 5; i++){
            //2. prompt to user to let them have their lucky money
            System.out.println("Enter anything to divide lucky money: ");
            sc.next(); // wait for user's input, after press enter then continue

            //3. let's generate a random amount of lucky money for current user
            while(true){
                int index = r.nextInt(moneys.length); // this will give us an integer 0 -4
                int money = moneys[index];

                //4. we need to know if the lucky money is empty or not
                if(money != 0){
                    System.out.println("Congratulation! You have lucky money: " + money + "yuan");
                    moneys[index] = 0;
                    break;  // End this round
                }
            }

        }
    }
}
