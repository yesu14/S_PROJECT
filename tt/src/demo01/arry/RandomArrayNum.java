package demo01.arry;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = getRandomNum();//获取随机数
            list.add(num);
        }
        System.out.println(list);
        for (int i : list) {
            System.out.println("列表：" + i);
        }

//        saveList();//保存到list
//        printList();//打印
    }

    private static void printList() {
    }

    private static void saveList() {
    }

    private static int getRandomNum() {
        Random r = new Random();
        int num = r.nextInt(33) + 1;
        return num;
    }
}
