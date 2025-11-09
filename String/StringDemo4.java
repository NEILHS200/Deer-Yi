package com.yde.Test1;

/**
 * call a method to reverse an array and print them in a format: [3,2,1] (no comma for the last number)
 */
public class StringDemo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = reverseArray(arr);
        printReversedArray(arr1);
    }

    public static int[] reverseArray(int[] arr){
        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void printReversedArray(int[] arr1){
        System.out.print("[");
        String number = " ";
        for (int i = 0; i < arr1.length; i++) {
            number = i == arr1.length - 1 ? arr1[i] + "" : arr1[i] + ", ";
            System.out.print(number);
        }
        System.out.print("]");
    }
}
