package demo01;

import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int x = s.nextInt();
        System.out.println("请输入第二个数字：");
        int y = s.nextInt();
        int resultJianfa=jianfa(x, y);
        System.out.println("差为："+resultJianfa);
    }

    public static int jianfa(int x, int y) {
        System.out.println("您输入的 第一个数字为："+x);
        System.out.println("您输入的 第二个数字为："+y);
        int result = x - y;
        return result;
    }


}
