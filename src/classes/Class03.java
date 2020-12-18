package classes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Class03 {
}

class GirlMarry {
    public static void main(String[] args) {
        float height = 181F;
        double money = 10000000L;
        boolean handsome = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("身高: ");
        height = scanner.nextFloat();
        System.out.print("财富: ");
        money = scanner.nextDouble();
        System.out.print("帅不: ");
        handsome = scanner.nextBoolean();
        if (height > 180 && money > 10000000 && handsome) {
            System.out.println("我一定要嫁给他。");
        } else if (height > 180 || money > 10000000 || handsome) {
            System.out.println("嫁吧，比上不足，比下有余。");
        } else {
            System.out.println("不嫁");
        }

        int a = 1;
        switch (a = 10) {
            case 10:
                System.out.println("十");
        }
    }
}

class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入day: ");
        int weekend = scanner.nextInt();
        switch (weekend) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("非法参数");
                break;
        }
    }
}

class UpperChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入:");
        char character = scanner.next().charAt(0);
        switch (character) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}

class ScoreStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        switch (score / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("过分了");
                break;
        }
    }
}

class MonthSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("啥季节???");
                break;
        }
    }
}

class StudentScoreLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩: ");
        int score = scanner.nextInt();
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("D");
                break;
            case 6:
                System.out.println("C");
                break;
            case 7:
            case 8:
                System.out.println("B");
                break;
            case 9:
            case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("S");
                break;
        }
    }
}

class WhichDay {
    public static void main(String[] args) {
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年: ");
        int year = scanner.nextInt();
        System.out.print("请输入月: ");
        int month = scanner.nextInt();
        System.out.print("请输入日: ");
        int day = scanner.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            days[2] += 1;
        }
        for (int i = 1; i < days.length; i++) {
            days[i] += days[i - 1];
        }
        System.out.println("这是" + year + "年的第" + (days[month-1] + day) + "天");
    }
}

class WhichDaySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年: ");
        int year = scanner.nextInt();
        System.out.print("请输入月: ");
        int month = scanner.nextInt();
        System.out.print("请输入日: ");
        int day = scanner.nextInt();
        boolean flag = false;
        int days = 0;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            flag = true;
        }
        switch(month){
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                if (flag)
                    days += 29;
                else
                    days += 28;
            case 2:
                days += 31;
            case 1:
                break;
            default:
                System.out.println("wrong day");
                break;
        }
        System.out.println("这是" + year + "年的第" + (days + day) + "天");

    }
}

class PrintStar{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int starLine = scanner.nextInt();
        for(int i = 0; i < starLine; i ++){
            System.out.println("*****");
        }

        for(int i = 0; i < starLine; i++){
            for(int j = 0; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 0; i < starLine; i++){
            for(int j = 0; j <= starLine - i - 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        for(int i = 0; i < starLine; i++){
            for(int j = 0; j < starLine - i ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j ++){
                System.out.print("*");
            }
            for(int j = 0; j <= i-1; j ++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 0; i < starLine-1; i++){
            for(int j = 0; j <= i + 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= starLine - i - 2; j++){
                System.out.print("*");
            }
            for(int j = 0; j <= starLine - i - 3; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class MulTable{
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " * " + j + " = " + i*j + " ");
            }
            System.out.println();
        }
    }
}

class AllPrime{
    public static void main(String[] args) {
        boolean flag = false;
        for(int i = 2; i < 100; i++){
            flag = false;
            for(int j = 2; j <= i / 2; j++){
                if(i %j == 0){
                    flag = true;
                    break;
                }
            }
            if(! flag)
                System.out.print(i + " ");
        }
    }
}

class thirteenDivision{
    public static void main(String[] args) {
        for (int i = 1;i <= 100 ;i++ ) {
            if(i % 13 == 0){
                System.out.println(i);
                continue;
            }
        }
    }
}

class ScannerInputNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int positive = 0;
        int minus = 0;
        while(true){
            num = scanner.nextInt();
            if (num > 0){
                positive += 1;
            } else if(num < 0){
                minus += 1;
            } else{
                break;
            }
        }
        System.out.println(positive);
        System.out.println(minus);

    }
}