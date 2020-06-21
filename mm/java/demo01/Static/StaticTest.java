package com.example.demo01.Static;

public class StaticTest {
    public static void main(String[] args) {
        Student stu1=new Student("学生1",10);
        Student stu2=new Student("学生2",20);

        stu1.gread= "教室1";

        System.out.println("姓名："+stu1.getUsername()+"年龄"+stu1.getAge()+"教室："+stu1.gread+"学号；"+stu1.getId());
        System.out.println("姓名："+stu2.getUsername()+"年龄"+stu2.getAge()+"教室："+stu2.gread+"学号；"+stu2.getId());





    }
}
