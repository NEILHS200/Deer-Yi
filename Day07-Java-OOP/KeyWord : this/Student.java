package com.yde.thisDemo;

public class Student {

    double score;

    public void printThis(){
        System.out.println(this);
    }

    public void printPass(double score){
        if(this.score < score){
            System.out.println("Congrats! You are passed!");
        }else{
            System.out.println("Im sorry! Try harder next time!");
        }
    }
}
