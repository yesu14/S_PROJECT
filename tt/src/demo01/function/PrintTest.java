package demo01.function;

public class PrintTest {
    public static void main(String[] args) {
        printOut(6);
    }

    private static void printOut(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i+" Hello World! ");
        }

    }
}
