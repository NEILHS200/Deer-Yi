package com.suna.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您的年龄： ");
        int age = scanner.nextInt();
        System.out.println("您的年龄是： " + age + "岁");


        System.out.println("您的名字是： ");
        String name = scanner.next();
        System.out.println("您的名字是： " + name);

        //
    }
}
