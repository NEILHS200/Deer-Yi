package com.suna.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(24) + 14; // [14 , 37]  - 14 -> [0 , 23]  // 减加法

        System.out.println("随机生成了： " + number);

        // 猜数字游戏 ：

        // 1. 先随机生成 1 - 100 的数字
        // 2. while loop
        // 3. Scanner
        // 4. 比较 if   else if   else
    }
}
