package com.suna.array;

/**
 * How do you define an array and access elements from that array.
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //定义格式 - 静态初始化数组
        //数据类型[] 数据名 = new 数据类型[]{元素1，元素2，...，元素n};
        int[] ages = new int[]{10, 20, 30};
        double[] scores = new double[]{68.2, 68.7, 99.5, 59.5};

        //简化格式
        //数据类型[] 数据名 = {元素1，元素2，...，元素n};
        int[] ages1 = {10, 20, 30};
        double[] scores1 = {68.2, 68.7, 99.5, 59.5};

        System.out.println(ages1);
        System.out.println(scores1);
    }
}
