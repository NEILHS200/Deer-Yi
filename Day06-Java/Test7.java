package com.yde;

public class Test7 {
    public static void main(String[] args) {
        // We are going to find all the prime number between 101 - 200
        findPrimeNumbers(101, 200);
    }

    public static void findPrimeNumbers(int startNumber, int endNumber){
        int count = 0;
        for(int i = startNumber; i <= endNumber; i++){
            // i = 101, 102, 103, ..., 200

            // use flag to solve this problem
            boolean flag = true;
            // we need to tell if current number is prime number
            for(int j = 2; j <= i / 2; j ++){
                if(i % j == 0){
                    // this current number is not prime number.
                    flag = false;
                    break;
                }
            }

            // if flag is true, then we found one prime number , count + 1
            if(flag){
                count++;
            }
        }
        System.out.println("The number of prime numbers between " +
                startNumber + " and " + endNumber + " is " + count);
    }
}
