package com.suna.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(a);
//
//        int[] arr = {11, 22, 33};
//        System.out.println(arr);
//        System.out.println(arr[1]);
//
//        arr[0] = 44;
//        arr[1] = 55;
//        arr[2] = 66;
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        int[] arr1 = {11, 22, 33};

        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1] = 99;
        System.out.println(arr1[1]);
    }
}
