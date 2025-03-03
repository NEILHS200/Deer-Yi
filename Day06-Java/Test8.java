package com.yde;
/**
 * I'll create a multiplication table by using a nested loop.
 */
public class Test8 {
    public static void main(String[] args) {
        createTable(9, 9);         // call createTable method and give it parameters.
    }

    public static void createTable(int rows, int cols){
        for (int i = 1; i <= rows; i++) { // This will create rows that I need
             // i = 1, 2, 3, 4, 5, 6, 7, 8, 9
            for (int j = 1; j <= i; j++) {                   // Every time it create a row, then create j cols.
                /*
                   j = 1
                   j = 1, 2
                   j = 1, 2, 3
                   j = 1, 2, 3, 4
                   j = 1, 2, 3, 4, 5
                   j = 1, 2, 3, 4, 5, 6
                   j = 1, 2, 3, 4, 5, 6, 7
                   j = 1, 2, 3, 4, 5, 6, 7, 8
                   j = 1, 2, 3, 4, 5, 6, 7, 8, 9
                 */
                System.out.print(j + " x " + i + " = " + i * j + "  ");
            }
            System.out.println();
        }
    }
}
