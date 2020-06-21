package demo01.arry;

public class ArrayMax {
    public static void main(String[] args) {
        getMax();
        getMin();
    }

    /* 最大值*/
    private static void getMax() {
        int[] arr = new int[]{6, 7, 11, 2, 33, 6};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);
    }

    /*最小值*/
    private static void getMin() {
        int[] arr = new int[]{6, 7, 11, 2, 33, 6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值为：" + min);
    }
}
