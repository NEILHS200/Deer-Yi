package com.yde.Test1;
/**
 * know how to use charAt() to solve problem
 */

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter something here： ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch);
        }
    }
}
