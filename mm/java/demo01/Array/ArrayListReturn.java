package com.example.demo01.Array;

/*题目：
存入20个随机数字，选取偶数放到小集合。
使用自定义方法
* 三要素：
返回值类型    arrayListSmall(个数不确定)
方法名称      creatRandomList(生成20个随机数)
             getSmallList(获取偶数)

参数列表      ArrayListBig（20个随机数）

* */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListReturn {
    public static void main(String[] args) {
        //用20个随机出生成一个列表
        ArrayList<Integer> randomlist = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            int creatNum = creatRamdomNum();
            randomlist.add(creatNum);
        }
        System.out.println(randomlist);
        ArrayList<Integer> evenList=getEvenList(randomlist);
        for (int i:evenList) {

            System.out.print(i+",");

        }
    }

    //生成随机数
    private static int creatRamdomNum() {
        Random num = new Random();
        int creatNum = num.nextInt(100);
        return creatNum;
    }

    //创建偶数列表 返回值： evenList 方法名：getEvenList
    private static ArrayList<Integer> getEvenList(ArrayList<Integer> randomlist) {
        int evenNum = 0;
        ArrayList<Integer> evenlist = new ArrayList<>();
        for (int i = 0; i < 20; i++) {

            if (randomlist.get(i) % 2 == 0) {
                evenNum = randomlist.get(i);
                evenlist.add(evenNum);
            }
        }
        return evenlist;
    }

}
