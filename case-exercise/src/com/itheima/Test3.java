package com.itheima;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入评委的个数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("选手的分数为：" + getAverageScore(number));
    }

    public static double getAverageScore(int number) {
        double[] scores = new double[number];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的得分");
            scores[i] = sc.nextDouble();
        }
        double min = scores[0];
        double max = scores[0];
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
            sum += scores[i];
        }
        sum = sum - max - min;
        return (sum / (number - 2));
    }
}
