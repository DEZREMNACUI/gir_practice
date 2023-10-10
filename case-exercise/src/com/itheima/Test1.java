package com.itheima;

public class Test1 {
    public static void main(String[] args) {
        double price = calculate(8, "经济舱", 1000);
        System.out.println("优惠价是：" + price);
    }
    public static double calculate(int month, String type, double price) {
        switch (type) {
            case "头等舱":
                if (month > 4 && month <11) {
                    price *= 0.9;
                } else {
                    price *= 0.7;
                }
                break;
            case "经济舱":
                if (month > 4 && month <11) {
                    price *= 0.85;
                } else {
                    price *= 0.65;
                }
                break;
        }
        return price;
    }
}
