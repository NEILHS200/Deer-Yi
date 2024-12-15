package com.yde;

import java.util.Scanner;

/**
 * 案例3： 在唱歌比赛中， 可能有多名评委给选手打分，0 - 100， 去掉一个最高分，去掉一个最低分， 算平均数。
 *  请编写程序能够录入多名评委的分数，并算出选手的最终得分。
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(getAverageScore(5));
    }

    public static double getAverageScore(int number){
        // 1. 定一个动态数组
        int[] scores = new int[5];


        // 2. 遍历数组的每个位置，依次录入分数
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++){
            System.out.println("请您录入第" + (i + 1) + "个评委的分数： ");
            int score = sc.nextInt();
            scores[i] = score;
        }

        // 3. 从数组中找出最高分，最低分
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for(int i = 0; i < scores.length; i ++){
            int score = scores[i];

            sum += score;

            if(score > max){
                max = score;
            }

            if(score < min){
                min = score;
            }
        }

        // 4. 计算平均分并返回
        return 1.0 * (sum - max - min) / (number - 2);
    }
}
