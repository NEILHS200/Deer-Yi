package com.suna.array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        /**
         * 数组求最值问题
         */
        int[] scores = {15, 9000, 10000, 20000, -5};
        //               0    1     2       3    4
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }
        }

        System.out.println("最大值是：" + max);

        /**
         * 数组反转 [10, 20, 30, 40, 50] --> [50, 40, 30, 20, 10]
         */
//        int[] arr = {10, 20, 30, 40, 50};
//        //           i                j
//        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

    }
}
