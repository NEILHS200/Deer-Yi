package com.yde.Test1;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String correctUsername = "Yider";
        String correctPassword = "YIdong474752!";

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Please enter your Username: ");
            String name = scanner.nextLine();

            System.out.print("Please enter your Password: ");
            String password = scanner.nextLine();

            if(correctUsername.equals(name) && correctPassword.equals(password)){
                System.out.println("You're log in!");
                break;
            }else{
                System.out.println("Sorry, your username or password isn't correct.");
            }
        }


    }
}
