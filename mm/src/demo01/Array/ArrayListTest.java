package demo01.Array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//添加数组
        list.add("qlt");
        System.out.println(list);

        list.add("user01");
        list.add("user02");
        list.add("user03");
        System.out.println(list);

//        list.add("user04");
        boolean isAdd=list.add("user04");
        System.out.println(isAdd);

        String removedUser=list.remove(0);
        System.out.println(removedUser);
        System.out.println(list);

        int arraySize=list.size();
        System.out.println("数组的长度为："+arraySize);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1000);
        System.out.println(list1);

    }
}
