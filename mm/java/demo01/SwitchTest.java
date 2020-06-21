package com.example.demo01;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
//        SwitchTest switchTest=new SwitchTest();
//        switchTest.searchClass();
        calculateScore();


    }
    public static void  calculateScore(){
        System.out.println("时请输入分数：");
        Scanner s=new Scanner(System.in);
        int score=s.nextInt();
        switch (score){
            case 50:
                System.out.println("不及格");
                break;
            case 70:
                System.out.println("及格");
                break;
            case 80:
                System.out.println("良好");
                break;

            case  90:
                System.out.println("优秀");
                break;
            default:
                System.out.println("无效的分数");
                break;
        }

    }
    public void searchClass(){
        System.out.println("请输入姓名：");
        Scanner s=new Scanner(System.in);
        String name=s.next();
        switch (name){
            case "金美燕":
                System.out.println("一班");
                break;
            case  "全林天":
                System.out.println("二班");
                break;
            case "全夏岚":
                System.out.println("三班");
                break;
            default:
                System.out.println("毕业");
                break;
        }
    }
}
