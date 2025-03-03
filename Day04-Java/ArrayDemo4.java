package com.suna.array;

import java.util.Scanner;

/**
 * 动态初始化数组
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        // 数据类型[] 数据名 = new 数据类型[ 长度 ];
//        int[] arr = new int[3];
//        System.out.println(arr[2]);
//
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        char[] arr = new char[3]; // byte short char int long  --> 0   float, double --> 0.0  boolean --> false
//        System.out.println((int)arr[0]);

//        String[] names = new String[80];
//        System.out.println(names[0]);

        // 动态初始化数组案例： 评委打分
        // 1. 定义一个动态初始化数组
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);

        // 2. 遍历数组， 录入分数
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入当前第" + (i + 1) + "个评委的分数： ");
            double score = sc.nextDouble();
            scores[i] = score;
        }

        // 3. 遍历数组，求平均分
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("选手的平均得分是： " + sum / scores.length);
    }
}
