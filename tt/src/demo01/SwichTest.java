package demo01;

import java.util.Scanner;

public class SwichTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入参数：");
        String iptParam = scanner.nextLine();
        getGrade(iptParam);
//        getScore(iptParam);
    }


    public static String getScore(String param){
        int score = Integer.valueOf(param);
        switch (score){
            case 50:
                System.out.println("不及格！");
                break;
            case 60:
                System.out.println("及格");
                break;
            case 70:
                System.out.println("良好");
                break;
            default:
                System.out.println("优秀");
                break;
        }
        return score+"";
    }

    public static String getGrade(String name){
        String grade = "";
        switch (name){
            case "金美燕":
                System.out.println("1班");
                grade = "1班";
                break;
            case "全夏岚":
                System.out.println("2班");
                grade = "2班";
                break;
            case "全林天":
                System.out.println("3班");
                grade = "3班";
                break;
            default:
                System.out.println("毕业");
                grade = "毕业";
                break;
        }
        return grade;
    }
}
