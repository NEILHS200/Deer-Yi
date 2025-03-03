package com.yde;
/**
 * 案例一： 用户购买机票时，机票会按照淡季，旺季，头等舱还是经济舱的情况进行优惠。
 *          优惠方案如下：
 *          5 - 10月是旺季， 头等舱9折，经济舱8.5折；
 *          11 - 来年4月是淡季，头等舱7折，经济舱6.5折。
 *          请开发程序计算出用户当前的机票的优惠价。
 */
public class Test1 {
    public static void main(String[] args) {
        double price = calculate(1000.0, 12, "经济舱");
        System.out.println(price);
    }

    public static double calculate(double price, int month, String type){
        // 1. 首先判断当前的月份是淡季还是旺季
        if(month >= 5 && month <= 10){
            //旺季
            //2. 判断仓位类型
            switch(type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else{
            //淡季
            switch(type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }

        return price;
    }
}
