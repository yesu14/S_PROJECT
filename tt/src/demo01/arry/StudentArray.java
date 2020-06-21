package demo01.arry;

import java.util.ArrayList;

public class StudentArray {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s = new Student("user01",1);
        Student s1 = new Student("user02",2);
        Student s2 = new Student("user03",3);
        Student s3 = new Student("user04",4);
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(1);
        }

        for (Student st:list// 1234
             ) {
            System.out.println(st.getName()+"\t"+st.getAge());
        }
    }
}
