package com.example.demo01;

import java.util.Scanner;

public class CompareTest {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a=s.nextInt();
        System.out.println("请输入第一个数字：");
        int b=s.nextInt();
        isSame(a,b);
        System.out.println(isSame(a,b));
    }
    public static boolean isSame(int a ,int b){
        return a==b;
    }
}
