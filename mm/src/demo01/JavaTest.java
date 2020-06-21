package demo01;

import java.util.Scanner;

public class JavaTest {
    public static void main(String[] args) {
        int a = 1;

        int z = 4 + 5;
        int y = 4 + 5 + a;

        System.out.println(z);
        System.out.println(y);

        Scanner s = new Scanner(System.in);
        System.out.println("请输入分数:");
        int score = s.nextInt();

        if (score > 60) {
            System.out.println("及格");
        } else if (score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println(score);
        }
        s.close();
    }
}
