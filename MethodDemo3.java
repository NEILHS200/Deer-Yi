package com.tianwen.functionDemo;

/**
 * 计算 1 - n 的和
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        int rs = sum(100);
        System.out.println(rs);
    }

    public static int sum(int n){
        int rs = 0;
        for (int i = 1; i <= n; i++) {
            rs += i;
        }
        return rs;
    }

}
