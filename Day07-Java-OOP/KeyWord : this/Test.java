package com.yde.thisDemo;

public class Test {
    public static void main(String[] args) {
        // In this case I am about learn a keyword : this
        // this: is a variable, use it to get current object
        Student s1 = new Student();
        s1.printThis();
        System.out.println(s1);

        System.out.println("-----------------------");

        Student s2 = new Student();
        s2.printThis();
        System.out.println(s2);

        System.out.println("------------------------");

        Student s3 = new Student();
        s3.score = 60.0;
        s3.printPass(90.0);
    }
}
