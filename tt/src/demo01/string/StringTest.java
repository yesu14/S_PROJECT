package demo01.string;

public class StringTest {
    public static void main(String[] args) {
//        Student s = new Student("use01", 10);
//        Student s2 = new Student("use01", 10);
//        System.out.println(s == s2);
//
//        String s3 = "1234asdf";
//        System.out.println(s3.length());
//        String s4 = "123".concat(s3);
//        System.out.println(s4);
//        System.out.println(s4.charAt(3));
//        System.out.println(s4.indexOf("1"));
//        String s = "12345abcde";
//        System.out.println(s.substring(2,5));
//
//        System.out.println(s.substring(5));
//
//        String s = "123";
//        System.out.println(System.identityHashCode(s));
//        System.out.println(System.identityHashCode(s));
//
//        int i = 1;
//        System.out.println(System.identityHashCode(i));
//        int a = 1;
//        System.out.println(System.identityHashCode(a));

//        char[] chars = "abcd".toCharArray();
//        System.out.println(chars[3]);
//        System.out.println(chars);
//        System.out.println(chars.length);

//        byte[] bytes = "abcd".getBytes();
//        System.out.println(bytes);
//        System.out.println(Arrays.toString(bytes));
//        for (int i = 0; i <bytes.length ; i++) {
//            System.out.println(bytes[i]);
//        }

//        String s = "123123412345";
//        System.out.println(s.replace("23","0"));


        int[] i = {1,2,3};
        String s = fromArrayToString(i);
        System.out.println(s);



    }
    public static String fromArrayToString(int[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                result += "[";
            }
            result += "word"+(i+1)+"#";
            if (i==arr.length-1){
                result =result.substring(0,result.length()-1);
                result+="]";
            }
        }
        return result;
    }
}
