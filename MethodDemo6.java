package com.tianwen.functionDemo;

public class MethodDemo6 {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = null;

        boolean rs = equal(arr1, arr2);
        System.out.println(rs);
    }

    public static boolean equal(int[] arr1, int[] arr2){
        //1. 判断两个数组是不是为null
        if(arr1 == null && arr2 == null){
            return true;
        }

        //2. 判断两个数组是不是其中一个是null
        if(arr1 == null || arr2 == null){
            return false;
        }

        //3. 判断两个数组长度是否相等
        if(arr1.length != arr2.length){
            return false;
        }

        //4. 判断内容是否一样
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
