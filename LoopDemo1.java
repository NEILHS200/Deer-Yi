package com.suna.loop;

/**
 * for , while, do-while , dead , nested loop
 */
public class LoopDemo1 {
    public static void main(String[] args) {
        //需求：打印5行hello world；

        /*for(int i = 0; i < 5; i++){
            System.out.println("Hello World!");
        }*/

        //需求：用循环算出1 - 5 的和
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }

        System.out.println(sum);

        //需求：用循环算出1-100的奇数和
        int sum1 = 0;
        for(int i = 1; i <= 100; i+=2 ){
            sum1 += i;
        }
        System.out.println(sum1);
    }
}
