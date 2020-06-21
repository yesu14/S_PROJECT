package demo01.Array;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int creatNum = getRandomNum();//生成随机数方法
            list.add(creatNum);
        }
        System.out.println("6个随机数："+list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i:list) {
            System.out.println("随机列表："+i);
        }

        //saveNum();//保存数据到list
    }

    /*private static void saveNum() {

    }*/

    private static int getRandomNum() {

        Random randomNum = new Random();
        int num = randomNum.nextInt(33) + 1;
        return num;
    }
}
