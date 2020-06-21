package demo01.staticc;

public class Student {
    private int id;
    private String name;
    private int age;
    public static String grade;
    public static int idCounter=1;

    public Student() {
        this.id = idCounter++;
    }

    public Student(String name, int age) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public static String getGrade() {
        return grade;
    }

    public static void setGrade(String grade) {
        Student.grade = grade;
    }
}
