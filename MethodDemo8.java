package com.tianwen.functionDemo;

public class MethodDemo8 {
    public static void main(String[] args) {
        /*、
            开发武器系统
            1. 默认发射一枚导弹
            2. 可以指定地区发射一枚导弹
            3. 可以指定地区发射指定数量的导弹
         */
        fire();
        fire("米国");
        fire("米国",999);
    }

    public static void fire(){
        fire("岛国");
    }

    public static void fire(String country){
        fire(country, 1);
    }

    public static void fire(String country, int number){
        System.out.println("发射了" + number + "枚导弹给" + country);
    }
}
