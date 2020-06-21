package com.example.demo01.Scanner;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入你一个数字：");

        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        //  System.out.println("求和结果为：" + sum(a, b));
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();
        System.out.println("最大值为：" + max(a, b, c));*/
        Scanner x = scannerReturn();
        int d = x.nextInt();
        System.out.println("输入的值为：" + d);

    }

    public static int max(int a, int b, int c) {
        /*if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        }else {
            if(b>c){
                return b;
            }else {
                return c;
            }
        }*/
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }

    public static int sum(int a, int b) {

        return a + b;
    }

    public static Scanner scannerReturn() {
        return new Scanner(System.in);
    }

}
