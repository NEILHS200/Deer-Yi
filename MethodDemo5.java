package com.tianwen.functionDemo;

/**
 * Java的参数传递机制： 值传递
 */
public class MethodDemo5 {
    public static void main(String[] args) {
//        int a = 10;
//        change(a);
//        System.out.println("main :" + a); // a = 10
        int[] arrs = {10, 20, 30};
        change(arrs);
        System.out.println("main :" + arrs[1]); // 222
    }

    public static void change(int[] arrs) {
//        System.out.println("1: " + num); // num = 10
//        num = 20;
//        System.out.println("2: " + num); // num = 20
        System.out.println("1: " + arrs[1]); // 20
        arrs[1] = 222;
        System.out.println("2: " + arrs[1]);  // 222
    }
}
