package com.yde.Test1;
/**
 * to count how many letters and number in a text
 */

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter something here: ");
        String input = scanner.nextLine();

        int smallCount = 0;
        int bigCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < input.length(); i++) {
           char ch = input.charAt(i);

           if(ch >= 'a' && ch <= 'z'){
               smallCount++;
           }else if(ch >= 'A' && ch <= 'Z'){
               bigCount++;
           }else if(ch >= '0' && ch <= '9'){
               numberCount++;
           }else{
               otherCount++;
           }
        }

        System.out.println("小写字母： " + smallCount + " 大写字母： " + bigCount + " 数字： " + numberCount + " d其他： " + otherCount);
    }
}
