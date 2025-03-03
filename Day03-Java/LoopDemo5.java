package com.suna.loop;

public class LoopDemo5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i ++){
            for(int j = 1; j <= 5; j ++){
                if(j == 2)
                   //break;
                    continue;
                System.out.println("第" + i + "天" + j);
            }
        }

        // *

        /*
            ****
            ****
            ****
         */
        /*for(int i = 1; i <= 3; i ++){
            // i = 1, 2, 3
            for(int j = 1; j <= 4; j++){
                System.out.print("*");  // 不换行
            }
            System.out.println(); // 换行
        }*/
    }
}
