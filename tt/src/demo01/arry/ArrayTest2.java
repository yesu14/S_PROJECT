package demo01.arry;


import demo01.oop.Person;

import java.util.ArrayList;

public class ArrayTest2 {
    public static void main(String[] args) {
//        Person[] pList = new Person[3];
//        Person p1 = new Person("user01",12);
//        Person p2 = new Person("user02",13);
//        Person p3 = new Person("user03",14);
//        pList[0] = p1;
//        pList[1] = p2;
//        pList[2] = p3;
//        System.out.println(pList[2].getName()+"\t" +pList[2].getAge());

        ArrayList<String> list = new ArrayList<>();
        list.add("user01");
        list.add("user02");
        list.add("user03");
        list.add("user04");
        System.out.println(list);
        boolean flag = list.add("user06");
        System.out.println(flag);
        String name = list.remove(3);

        ArrayList<Person> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

    }
}
