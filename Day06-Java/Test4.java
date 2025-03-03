package com.yde;

/**
 * 案例4： 某系统的数字密码是一个四位数，比如 1999， 为了安全，需要加密后传输
 * 加密规则是： 对密码中的每位数 都加5，再对10取余。最后将所有数字顺序反转，得到一串加密后的新密码；
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(encrypt(4446));
    }

    public static String encrypt(int number){
        //1. 把这个密码拆成一个个数字
        int[] numbers = split(number);
        // 1999

        //2.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        // [6, 4, 4 ,4]

        //3. 反转顺序
        reverse(numbers);

        //4. 拼接密码
        String code = "";
        for (int i = 0; i < numbers.length; i++) {
            code += numbers[i];
        }

        return code;

    }

    public static int[] split(int number){
        // 1999
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }

    public static void reverse(int[] numbers){
        // 反转
        for(int i = 0, j = numbers.length - 1; i < j; i ++, j--){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }
}
