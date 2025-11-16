package com.yde.StringBuilder;
/**
 * This program is used to determine
 * whether the number entered by the user is a symmetric string,
 * for example: 123321 or 121.
 */

import java.util.Scanner;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //To get user's input

        System.out.println("Please enter any number here: ");
        StringBuilder sb = new StringBuilder(scanner.next());

        //Check if the number is symmetric or not
        //if a number is symmetric means whether we count from left or right,the number is same

        StringBuilder input = new StringBuilder(sb);
        StringBuilder reversed_sb = new StringBuilder(input.reverse());

        if(sb.toString().equals(reversed_sb.toString())){
            System.out.println("Yes, it is a symmetric number.");
        }else{
            System.out.println("No. It is not.");
        }

    }
}
