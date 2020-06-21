package demo01.oop;

public class Phone {
    public String brand;
    public double price;
    public String color;

    public void call(int num){
        System.out.println("打电话给："+num);
    }

    public void sendMsg(int num,String msg){
        System.out.println("发短信给："+num);
        System.out.println("短信内容为："+msg);
    }
}
