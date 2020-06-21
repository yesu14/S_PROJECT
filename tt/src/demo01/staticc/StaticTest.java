package demo01.staticc;

public class StaticTest {
    public static void main(String[] args) {
        Student s1 = new Student("user01",1);
        Student s2 = new Student("user02",2);

        s1.grade = "1班";
        System.out.println(s1.getName()+"\t"+s1.getAge()+"\t"+s1.getId()+"\t"+s1.grade);
        System.out.println(s2.getName()+"\t"+s2.getAge()+"\t"+s2.getId()+"\t"+s1.grade);
    }
}
