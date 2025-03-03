package com.tianwen.functionDemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        printHelloWorld();


        System.out.println("---------------------------");

        printHelloWorld();
    }

    /**
     * 无参数的方法，无返回值的方法
     */

    public static void printHelloWorld(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!");
        }
    }

}
