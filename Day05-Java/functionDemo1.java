package com.tianwen.functionDemo;

/**
 * 今天我们来讲方法
 */
public class functionDemo1 {
    public static void main(String[] args) {
        /*
           修饰符 返回值类型 方法名（形参列表）{
                方法体代码（）；
                return 值；
           }
         */
//        //1. 伊德尔
//        int a = 10;
//        int b = 20;
//        int c = a + b;
//        System.out.println("和是： " + c);
//
//
//        //2. 闫天文
//        int a1 = 20;
//        int b1 = 30;
//        int c1 = a1 + b1;
//        System.out.println("和是： " + c1);

        sum(10, 20);
    }

    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}
