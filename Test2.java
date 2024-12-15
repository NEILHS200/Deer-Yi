package com.yde;

import java.util.Random;

/**
 *  案例2： 开发一个程序，可以生成指定位数的验证码，每位可以是数字，大小写字母
 */
public class Test2 {
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println(code);
    }

    public static String createCode(int n){
        // 1. 定义一个for循环控制产生多少位的随机字符
        Random random = new Random();
        String code = "";
        for (int i = 1; i <= n; i++) {
            // i = 1 2 3 4 5
            // 随机生成 0， 1 ，2 的任意一个数字
            int type = random.nextInt(3);
            switch(type){
                case 0:
                    //随机生成一个数字
                    code += random.nextInt(10);
                    break;
                case 1:
                    //大写字母 A = 65  Z = 65 + 25   (0 - 25) + 65
                    char ch1 = (char)(random.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    //小写字母 a = 97 z = 97 + 25
                    char ch2 = (char)(random.nextInt(26) + 97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
