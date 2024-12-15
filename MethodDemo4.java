package com.tianwen.functionDemo;

import java.util.Scanner;

/**
 * 判断一个整数是奇数还是偶数
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        System.out.println("请输入您想要判断的整数： ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        judge(number);
    }

    public static void judge(int number){
        if(number % 2 == 0){
            System.out.println(number + "是一个偶数！");
        }else{
            System.out.println(number + "是一个奇数！");
        }
    }
}
