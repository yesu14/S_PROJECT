package com.example.demo01.Array;

//要求：打印数组[user01@user02@user03@user04]
/*方法三要素：
 * 返回值  void
 * 方法名称  printArrayList
 * 参数列表  list
 * */

import org.junit.jupiter.api.BeforeEach;
import org.thymeleaf.standard.expression.Each;

import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();

        User user1=new User("user01");
        User user2=new User("user02");
        User user3=new User("user03");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        printArrayList(list);

    }

    private static void printArrayList(ArrayList<User> list) {
        System.out.print("{");
        for (User user:list) {

            if (user.getUser()=="user03"){
                System.out.print(user.getUser()+"}");
            }else {
                System.out.print(user.getUser() + "@");
            }
        }


    }


}
