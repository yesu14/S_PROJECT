package demo01.Random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {

//        int y=randomNum();
//        System.out.println("随机数为：" + y);

        int z=randomPrint();
        System.out.println(z);



    }

    public static int randomNum() {
        Random num = new Random();
        int x = num.nextInt();
        return x;
    }
    public static int randomPrint(){
        int a=5;
        int x=0;
        Random num=new Random();
        for (int i = 0; i < 10; i++) {
            x=num.nextInt(a);
            System.out.println("随机数为:"+x);
        }
        return x;

    }
}
