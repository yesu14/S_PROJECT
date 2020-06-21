package demo01;

public class JavaType {
    public static void main(String[] args) {
//        int num1 = (int)600000000000400l;
//        System.out.println(num1);
//        int num2 = (int)3.33;
//        System.out.println(num2);
//        char c1 = 'A';
//        System.out.println(c1);
//        System.out.println(c1+1);
//
//
//        int i = Integer.MAX_VALUE;
//        System.out.println(i);
//        System.out.println(i+1);
//        System.out.println(i+2);
//        System.out.println(i+3);
//        System.out.println(i+i);
//        System.out.println(i+i+i);
//        System.out.println(i+i+i+i);

        byte b1 = 40;
        byte b2 = 50;
        int b3 = b1+b2;
        System.out.println(b3);
        /* 70번 * 70년 */

        long i = 70*60*24*365*70l;
        System.out.println(i);

        double d = 10/3d;
        System.out.println(d);

        System.out.println(Math.PI);

        int i1 = 10;
        System.out.println(i1);
        i1++;
        System.out.println(i1++); // 10
        i1++;// 11
        System.out.println(++i1);//12

        int score = 70;
        System.out.println(score>60?"及格":"不及格");
    }
}
