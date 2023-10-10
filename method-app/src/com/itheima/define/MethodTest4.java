package com.itheima.define;

public class MethodTest4 {
    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
public static void judge(int number) {
        if (number % 2 == 0) {
            System.out.println(number + "是一个偶数!");
        } else {
            System.out.println(number + "是一个奇数！");
        }
}
    public static void main(String[] args) {
        int rs = add(5);
        System.out.println("1到5的和是:" + rs);
        int rs2 = add(100);
        System.out.println("1到100的和为：" + rs2);
        judge(10);
    }
}
