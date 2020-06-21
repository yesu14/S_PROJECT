package demo01.String;

import com.example.demo01.Array.Student;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        Student student1 = new Student("user01", 10);
        Student student2 = new Student("user01", 10);
        System.out.println(student1 == student2);
        System.out.println(student1.getStudentName() == student2.getStudentName());

        int length = "1234567890".length();
        System.out.println("字符串的 长度为：" + length);

        String str1 = "hello~";
        String str2 = "qlt";
        String str3 = str1.concat(str2);
        System.out.println("拼接后：" + str3);

        System.out.println(str3.charAt(1));

        System.out.println(str3.indexOf("qlt" + 1));

        String str4 = "12345abcde";
        System.out.println(str4.substring(2, 5));
        System.out.println(str4.substring(5));
        System.out.println(str4.substring(5, 10));
        //打印内存地址
        System.out.println(System.identityHashCode(str4));

        //转换成字char类型数组
        char[] chars = "abcd".toCharArray();
        System.out.println(chars);
        System.out.println(chars[3]);
        System.out.println(chars.length);

        //转换成字节数组
        byte[] bytes="abcd".getBytes();

        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println(Arrays.toString(bytes));

        //替换内容
        String str5="123123412345";
        System.out.println(str5.replace("23","0"));

    }


}
