package com.tianwen.arrayDemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //多个变量指向同一个数组
//        int[] arr = {12, 13, 14};
//        int[] arr2 = arr;
//
//        System.out.println(arr);
//        System.out.println(arr2);
//
//        arr2[1] = 99;
//        System.out.println(arr[1]);

//        int[] arr = null;
//
//        System.out.println(arr);
//
//        System.out.println(arr.length);

        //需求：找颜值最高的女朋友
//        int[] points = {2, 10, 20, 3, 80, 79};
//
//        int max = points[0];
//
//        for (int i = 1; i < points.length; i++) {
//            if(points[i] > max){
//                max = points[i];
//            }
//        }
//
//        System.out.println("最高值是：" + max);

        //数组反转
        //           50  40   30 20 10
//        int[] arr = {10, 20, 30, 40, 50};
//        //
//
//        for(int i = 0, j = arr.length - 1; i < j ; i ++, j --){
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//        }
//
//        for(int i = 0; i < arr.length; i ++){
//            System.out.print(arr[i] + ",");
//        }

        // int[] arr = {10, 20, 30, 40, 50}; 格式： [10, 20, 30, 40, 50]
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            String str = i == arr.length - 1 ? arr[i]+"" : arr[i] + ",";
            System.out.print(str);

        }
        System.out.print("]");


    }
}
