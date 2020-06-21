package demo01;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("QLT",50);
        System.out.println(student1.getName()+student1.getAge());
    }
}
