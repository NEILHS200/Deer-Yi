package com.suna.branch;

/**
 * Today, I learned branch and loop
 */
public class BranchDemo1 {
    public static void main(String[] args) {

        // branching - - - if
        // There are 3 types of if
        /*
            1. if(conditions){

                }

            2. if(conditions){

                }else{

                }


            3. if(          ){

                }
                else if(    ){

                }
                else if(    ){

                }
                else{

                }
        */

        //需求：用户体温，高于37度报警
        /*double t = 37.5;
        if(t >= 37){
            System.out.println("您的体温异常！");
        }*/


        //需求：发红包，你的钱包余额是99元，现在要发99元。如果钱够，触发发红包的动作，否则提示余额不足。
       /* double money = 98;
        if(money >= 99){
            System.out.println("成功！");
        }else{
            System.out.println("余额不足！");
        }*/


        //需求：某个公司有一个绩效系统，根据员工的打分输出对应的等级
       /* int score = 0;
        if(score >= 0 && score < 60){
            System.out.println("您的绩效等级是： D");
        }else if(score >= 60 && score < 80){
            System.out.println("您的绩效等级是： C");
        }else if (score >= 80 && score < 90){
            System.out.println("您的绩效等级是： B");
        }else if (score >= 90 && score <= 100){
            System.out.println("您的绩效等级是： A");
        }else{
            System.out.println("您录入的分数有问题！");
        }*/


    }
}
