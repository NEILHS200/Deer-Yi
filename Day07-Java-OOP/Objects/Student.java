package com.yde.object;

public class Student {
    String name;
    double chinese;
    double math;

    public void printTotalScore(){
        System.out.println(name + "'s total score is: " + (chinese + math));
    }

    public void printAverageScore(){
        System.out.println(name + "'s average score is: " + (chinese + math) / 2);
    }

}
