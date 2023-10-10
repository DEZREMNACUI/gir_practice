package com.itheima;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(createCode(4));
    }
    public static String createCode(int n) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    code += r.nextInt(10);
                    break;
                case 1:
                    code += (char) (r.nextInt(26) + 65);
                    break;
                case 2:
                    code +=(char) (r.nextInt(26) + 97);
                    break;
            }
        }
        return code;
    }
}
