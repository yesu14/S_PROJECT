package demo01;

import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第①个数字：");
        int a = s.nextInt();
        System.out.println("请输入第②个数字：");
        int b = s.nextInt();
        int result = jianfa(a,b);
        System.out.println("结果为:"+result);
    }

    private static int jianfa(int a ,int b) {
        System.out.println("a="+a+",b="+b);
        int result = a - b;
        return result;
    }


}
