package demo01.staticc;

public class Person {
    private String name;
    private int age;
    static int count=0;

    static {

        System.out.println("1");

    }
    public Person() {
        System.out.println("2");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("3");
        count++;
        System.out.println("count:"+count);
    }

    public String getName() {
        System.out.println("4");
        return name;
    }

    public void setName(String name) {
        System.out.println("5");
        this.name = name;
    }

    public int getAge() {
        System.out.println("6");
        return age;
    }

    public void setAge(int age) {
        System.out.println("7");
        this.age = age;
    }
}
