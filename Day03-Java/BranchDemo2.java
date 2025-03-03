package com.suna.branch;

/**
 * Today, I learned switch.
 */
public class BranchDemo2 {
    public static void main(String[] args) {
        /*
            switch(表达式){
                case 值1:
                    执行的代码、、;
                    break;
                case 值2:
                    执行的代码、、;
                    break;
                case 值n:
                    执行的代码、、;
                    break;
                default:
                    执行的代码;
            }
         */

        /*
            周一：上班!
            周二：上班!
            周三：上班!
            周四：上班!
            周五：上班!
            周六：睡觉
            周日：睡觉
         */
        int week = 6;
        switch(week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("上班！");
                break;
            case 6:
            case 7:
                System.out.println("睡觉！");
                break;
            default:
                System.out.println("你输入的信息有误！");
        }
    }
}
