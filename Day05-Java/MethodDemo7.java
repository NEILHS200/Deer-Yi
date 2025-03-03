package com.tianwen.functionDemo;

/**
 * 方法重载
 */
public class MethodDemo7 {
    public static void main(String[] args) {
        test();
        test(100, 1.0);
        test(100, 1.0);
    }

    public static void test(){
        System.out.println("==test1==");
    }

    public static void test(int a, double b){
        System.out.println("==test2==" + a);
    }

    static void test(double a, int b){

    }

}
