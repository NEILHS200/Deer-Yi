package com.yde.StringBuilder;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //call printArr method
        printArr(arr);
    }

    //define a method that print arr in this format: [1,2,3]
    public static void printArr(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        sb.append("]");
        System.out.println(sb);
    }
}
