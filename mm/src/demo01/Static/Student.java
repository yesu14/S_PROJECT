package demo01.Static;

public class Student {
    private  String username;
    private  int age;
    private  int id;
    private  static  int idcounter=0;
    public static String gread;

    public Student() {
        this.id=++idcounter;
    }

    public Student(String username, int age) {
        this.username = username;
        this.age = age;
        this.id = ++idcounter;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getGread() {
        return gread;
    }

    public static void setGread(String gread) {
        Student.gread = gread;
    }
}
