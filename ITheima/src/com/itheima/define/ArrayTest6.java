package com.itheima.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入当前第" + (i + 1) + "个评委的分数：");
            double score = sc.nextDouble();
            scores[i] = score;
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        double average = sum / scores.length;
        System.out.println("评委的评价打分为：" + average);
    }
}
