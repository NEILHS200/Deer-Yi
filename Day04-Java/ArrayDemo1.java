package com.suna.array;

import java.util.Random;

/**
 * Today I learned array.
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //数组 就是一个容器，用来储存同种类型的数据
        // 10, 20, 30, 40, 50
        int[] numbers = {10, 20, 30, 40, 50};

        // abc, cbd, dce, cef
        String[] letters = {"abc", "cbd", "dce", "cef"};

        //为什么学数组？ 比如：随机点名
        String name1 = "周杰伦";
        String name2 = "陶喆";
        String name3 = "王力宏";
        String name4 = "林俊杰";
        String name5 = "薛之谦";
        String name6 = "张靓颖";
        String name7 = "邓紫棋";
        String name8 = "那英";
        String name9 = "周笔畅";

        Random r = new Random();
        int number = r.nextInt(9) + 1;

        switch(number){
            case 1:
                System.out.println(name1 + "站起来唱歌！");
                break;
            case 2:
                System.out.println(name2 + "站起来唱歌！");
                break;
            case 3:
                System.out.println(name3 + "站起来唱歌！");
                break;
            case 4:
                System.out.println(name4 + "站起来唱歌！");
                break;
            case 5:
                System.out.println(name5 + "站起来唱歌！");
                break;
            case 6:
                System.out.println(name6 + "站起来唱歌！");
                break;
            case 7:
                System.out.println(name7 + "站起来唱歌！");
                break;
            case 8:
                System.out.println(name8 + "站起来唱歌！");
                break;
            case 9:
                System.out.println(name9 + "站起来唱歌！");
                break;
            default:
                System.out.println("系统有误！");
        }

        //学过数组之后
        String[] names = {"周杰伦", "王力宏", "陶喆", "林俊杰", "薛之谦", "张靓颖", "邓紫棋", "那英", "周笔畅"};
        Random random = new Random();
        System.out.println(names[random.nextInt(9)] + "站起来唱歌！");


    }
}
