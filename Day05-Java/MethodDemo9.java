package com.tianwen.functionDemo;

public class MethodDemo9 {
    public static void main(String[] args) {
        System.out.println("运行了开始的代码");
        divide(10, 0);
        System.out.println("关键代码！");
    }

    public static void divide(int a, int b){
        if(b == 0){
            System.out.println("分母不能为0");
            return;
        }

        int c = a / b;
        System.out.println(c);
    }
}
