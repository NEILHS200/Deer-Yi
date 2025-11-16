package com.yde.StringBuilder;

/**
 * How do you use StringBuilder
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.Create an StringBuilder Object
        StringBuilder sb = new StringBuilder("abc");

        //2.Add elements to the StringBuilder
        /*sb.append(1);
        sb.append(2.3);
        sb.append("yider");
        sb.append('s');
        sb.append(true);*/

        //3. reverse the string
        sb.reverse();

        //4. To get the length of the String
        int length = sb.length();
        System.out.println(length);

        // print out sb
        System.out.println(sb);
    }
}
