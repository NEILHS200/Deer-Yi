package com.yde.object;

public class Test {
    public static void main(String[] args) {
        // This is for simple oop program
        // 1. create a student object and encapsulate Bob's data
        Student s1 = new Student();
        s1.name = "Bob";
        s1.chinese = 98.5;
        s1.math = 60.5;

        // 2. create another student object and also encapsulate it.
        Student s2 = new Student();
        s2.name = "Betty";
        s2.chinese = 97.5;
        s2.math = 96.5;

        // 3. print their total score and average score
        s1.printTotalScore();
        s1.printAverageScore();

        s2.printTotalScore();
        s2.printAverageScore();

    }
}
