package demo01.function;

public class CompareTest {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));
    }

    public static boolean isSame(int a,int b){
        return a == b;
    }
}
