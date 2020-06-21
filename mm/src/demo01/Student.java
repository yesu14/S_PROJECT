package demo01;

public class Student {
    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public Student() {
        System.out.println("无参构造方法");
    }

    //全参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("姓名" + this.name + "年龄" + this.age);
    }

    //getter&setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
