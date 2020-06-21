package demo01;

public class Person {
    public String name;
    public  int age;

    public  void talk(String msg){
        System.out.println(name+"说"+msg);
    }
    public  void  run(int metre){
        System.out.println(name+"跑了"+metre+"米");
    }

}
