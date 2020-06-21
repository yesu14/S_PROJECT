package demo01;

public class Overload {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        sum(1,2,3,4,5,6,7);
    }

    public static int sum(int a, int b) {
        System.out.println("执行两个参数的方法");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("执行三个参数的方法");
        return a + b + c;
    }
    public static  void sum(int... param){
        for (int i = 0; i < param.length; i++) {
            System.out.println("第"+i+"个参数为："+param[i]);

        }
    }

}
