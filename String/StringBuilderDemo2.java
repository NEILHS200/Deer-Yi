package com.yde.StringBuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1. Create an object
        StringBuilder sb = new StringBuilder();

        //2. To add string

        /*sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");*/

        sb.append("aaa").append("bbb").append("ccc").append("ccc");

        //3. print out the String
        System.out.println(sb);

        //4. turn StringBuilder to String
        String str = sb.toString();
        System.out.println(str);

    }
}
