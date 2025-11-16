package com.yde.StringBuilder;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        // Method Chaining

        int len = getString().substring(1).replace("A", "Q").length();
        System.out.println(len);

    }

    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = scanner.next();
        return str;
    }
}
