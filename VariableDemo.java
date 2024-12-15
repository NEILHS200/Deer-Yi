package com.suna.variable;

/**
 *  Today's content is variable
 */
public class VariableDemo {
    public static void main(String[] args) {
        // format: 数据类型 变量名称 = 数据；

        // Integer
        int age = 27; // This is suna's age
        System.out.println("Suna 的年龄是： " + age);
        //age = age + 3; // age += 3;
        age++; // age += 1;
        System.out.println("suna: " + age);

        // String
        String name = "Suna";

        System.out.println(name + "的年龄是： " + age);

        // 变量名称 ： 标识符
        // 基本组成： 数字，字母，下划线，美元符号
        // 强制要求： 不能以数字开头，不能用关键字作为名字，并且大小写区分  拼写规则：camel
                //int 1age = 24;
                //int class = 24;
                /*int length = 100;
                int Length = 100;*/
                //String name1 = "Deer";
                //String my_height = "180";
                //String $name = "Deer";
                //String myFriendHeight = "160";
                // bj, b2, 2b, class, $2, 中国, _2b, #deer, ak47, Class, HelloWorld

    }
}
