package demo01;

public class PrintCount {
    public static void main(String[] args) {
        count(5);
    }
    public static void count(int num){
        for (int i = 1; i <=num ; i++) {
            System.out.println("hello"+i);
        }
    }
}
