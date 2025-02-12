package com.yde;

/**
 * I‘ll create a triangle by using *
 * It should look like this:
 *             *
 *            * *
 *           * * *
 *          * * * *
 *         * * * * *
 *   Consider this has 5 rows and 9 cols, but we can consider: * and space are one unit.
 *   Then the first star is at 5th col
 */
public class Test9 {
    public static void main(String[] args) {
        createTriangle(5);    //we can only type in rows and rows & cols are the same
                                    // so lets only pass rows to that method
    }

    public static void createTriangle(int rows){
        for (int i = 0; i < rows; i++) {
            // type space first
            for(int k = rows - i; k >= 0; k--){
                System.out.print(" ");
            }
            // type one star + one space secondly
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }
}
