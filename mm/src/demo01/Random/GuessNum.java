package demo01.Random;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        playGame();

    }

    public static int randomNum() {
        Random num = new Random();
        int x = num.nextInt(100);
        return x;
    }

    public static int scannerNum() {
        return new Scanner(System.in).nextInt();
    }

    public static void playGame() {
        int a = randomNum();
        while (true) {
            System.out.println("请输入您猜测的数字：");
            int b = scannerNum();

            if (a > b) {
                System.out.println("小");
                continue;
            } else if (a < b) {
                System.out.println("大");
                continue;
            } else {
                System.out.println("恭喜您答对了！");
                break;
            }
        }
    }
}
