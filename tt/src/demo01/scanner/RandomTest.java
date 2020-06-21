package demo01.scanner;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
//        System.out.println(getRandom());
//        getRandom();
//        getRandom2();
        playRandomGame();
    }

    public static int getRandom() {
        Random rd = new Random();
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = rd.nextInt();
            System.out.println(j);
        }

        return j;
    }

    public static int getRandom2() {
        int i = 5;
        Random rd = new Random();
        int j = rd.nextInt(i) + 1;
        System.out.println(j);
        return j;
    }


    public static void playRandomGame() {
        Random rd = new Random();
        int i = rd.nextInt(100);
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字：");
            int guessNum = sc.nextInt();

            /*如果猜对了返回true*/
            if (compareNum(i, guessNum)) {
                System.out.println("恭喜您猜对了！");
                break;
            }
        }
    }

    private static boolean compareNum(int i, int guessNum) {
        if (i == guessNum) {
            return true;
        } else {
            if (i > guessNum) {
                System.out.println("您猜小了,请重试！");
            } else {
                System.out.println("您猜大了,请重试！");
            }
            return false;
        }
    }
}
