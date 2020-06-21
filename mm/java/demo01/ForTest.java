package com.example.demo01;

public class ForTest {
    public static void main(String[] args) {
        //for 循环
//        int result= 0;
//        for(int i=1;i<=100;i++){
//            result=result+i;//1
//            System.out.println("和为："+result);
//        }

        //while循环
//        int i=1;
//        int result1=0;
//        while (i<=100){
//            result1=result1+i;
//            i++;
//            System.out.println("和："+result1);
//        }

        //do while
//        int i=1;
//        int result2=0;
//        do {
//            result2=result2+i;
//            i++;
//            System.out.println("求和："+result2);
//        }while (i<=100);
//
        //从1加到X＝5050，求X
//        int i = 1;
////        int result3 = 5050;
////        while (result3 > 0) {
////            result3 = result3 - i;
////            i++;
////        }
////        System.out.println("结果为：" + --i);

        //1到100之间的偶数之和
        /*int result4 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                result4 = result4 + i;
            }
        }
        System.out.println("和为：" + result4);*/
        //break 跳出整个循环
        /*for (int i = 0; i < 100; i++) {
            if (i >= 3) {
                break;
            }
            System.out.println(i);
        }*/
        //continue 跳出本次循环 1到10，不显示4
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
