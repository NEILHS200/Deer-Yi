package com.yde.Test1;

import java.util.Scanner;

/**
 * On checks in China, in addition to numerical figures,
 * the amount is also written in Chinese characters.
 * This program automatically converts
 * the numbers entered by the user into their corresponding Chinese characters.
 */
public class StringDemo5 {
    public static void main(String[] args) {
        //1. get user input : number
        Scanner scanner = new Scanner(System.in);
        int money = 0;
        while(true){
            System.out.println("Please enter an number between 0 and 9999999: ");
            money = scanner.nextInt();
            if(money < 0 || money > 9999999){
                System.out.println("Invalid number! Please enter again! ");
            }else{
                break;
            }
        }
        System.out.println(money);

        //3. print number we have in Chinese
        String text = "";
        while(true){
            int ge = money % 10;
            money = money / 10;

            String capitalNumber = getCapitalizedNumber(ge);
            text = capitalNumber + text;

            if(money == 0){
                break;
            }
        }
        //make sure these number are in correct order
        System.out.println(text);

        //4. if the number is not 7 digits, we need to fill up zeros in the front of number
        int count = 7 - text.length();
        for (int i = count + 1; i < 7; i++) {
            text = "零" + text;
        }
        System.out.println(text);

        //5. add unit to each number
        String[] units = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + units[i]);
        }
    }

    //2. Define a method to get every Chinese characters needed
    public static String getCapitalizedNumber(int number){
        String[] characters = {"零","壹","贰","叁","肆","伍","陆","七","八","九"};
        //return result
        return characters[number];
    }








    /*public static String getCapitalizedNumber(int number){
        String[] characters = {"零","壹","贰","叁","肆","伍","陆","七","八","九"};
        String chineseNumber = "";
        //To get first digit
        while(number > 0){
            int ge = number % 10;
            number = number / 10;
            System.out.println(characters[ge]);
            chineseNumber = chineseNumber + characters[ge];
        }
        return chineseNumber;

    }*/
}
