package demo01.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数字：");
//        int x = sc.nextInt();
//        System.out.println("请输入第二个数字：");
//        int y = sc.nextInt();
////        System.out.println("和="+getSum(x, y));
//        System.out.println("请输入第三个数字");
//        int z = sc.nextInt();
//        System.out.println("最大值：" + getMax(x, y, z));

        Scanner sc1 = reTurnScanner();
        System.out.println("请输入数字：");
        int i = sc1.nextInt();
        System.out.println("输入的数字为："+i);
    }

    private static int getSum(int x, int y) {
        return x + y;
    }

    private static int getMax(int a1, int a2, int a3) {
        int max = a1 > a2 ? a1 : a2;
        max = max > a3 ? max : a3;
        return max;
    }

    public static Scanner reTurnScanner(){
        return new Scanner(System.in);
    }

}
