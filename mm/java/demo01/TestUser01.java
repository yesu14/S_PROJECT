package com.example.demo01;

public class TestUser01 {
    public static void main(String[] args) {
        User01 user01 = new User01();
        user01.setUsername("qlt");
        user01.setAge(20);
        System.out.println("姓名" + user01.getUsername() + "年龄" + user01.getAge());

        System.out.println("===========================");
        User01 user02 = new User01("QIL", 30);

        System.out.println("姓名" +user02.getUsername()+"年龄"+user02.getAge());
        user02.setUsername("jmy");
        user02.setAge(10);
        System.out.println("姓名" +user02.getUsername()+"年龄"+user02.getAge());

    }
}
