package demo01.Array;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student one=new Student("学生1",10);
        Student two=new Student("学生2",20);
        Student three=new Student("学生3",30);

        list.add(one);
        list.add(two);
        list.add(three);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("学生姓名："+list.get(i).getStudentName()+list.get(i).getStudentAge());
        }
        for (Student stu:list) {
            System.out.println("学生姓名："+stu.getStudentName()+"学生年龄"+stu.getStudentAge());
        }


    }

}
