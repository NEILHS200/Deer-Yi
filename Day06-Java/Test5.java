package com.yde;

/**
 * 把一个整型数组，存了：11， 22， 33，拷贝成一个一模一样的新数组出来
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13};
        int[] arr2 = copy(arr);
        print(arr2);
    }

    public static int[] copy(int[] arr){
        // 1. 创建一个长度一样的新数组
        int[] arr2 = new int[arr.length];

        // 2.
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        return arr2;
    }

    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
