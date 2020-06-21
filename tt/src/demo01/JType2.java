package demo01;

import java.util.Scanner;

public class JType2 {
    public static void main(String[] args) {
        System.out.println("请输入分数：");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println(score);
        if (score < 60) {
            System.out.println("及格");
        } else if (score < 60) {
            System.out.println("不及格");
        } else if (score == 60) {
            System.out.println("刚好及格");
        }


    }
}
