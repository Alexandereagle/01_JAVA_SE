package classes;

import java.util.Scanner;

public class Class05 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}


class PrintPrime {
    public static void main(String[] args) {
        boolean flag;
        for (int i = 2; i <= 100; i++) {
            flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}

class SumTwo {

    public static void main(String[] args) {
        System.out.println(sumTwoNumber(1, 2));
        System.out.println(sumTwoNumber(1L, 2));
        System.out.println(sumTwoNumber(2.3, 3.4));
        System.out.println(sumTwoNumber("a", "b"));
    }

    public static int sumTwoNumber(int i, int j) {
        return i + j;
    }

    public static double sumTwoNumber(double i, double j) {
        return i + j;
    }

    public static long sumTwoNumber(long i, long j) {
        return i + j;
    }

    public static String sumTwoNumber(String i, String j) {
        return i + j;
    }
}

class Login {
    public static void main(String[] args) {
        loginSuccess();
    }

    public static void loginSuccess() {
        System.out.print("请输入用户名: ");
        Scanner scanner = new Scanner(System.in);
        int userName = scanner.nextInt();
        System.out.print("请输入密码: ");
        int password = scanner.nextInt();
        if (userName == 123456 && password == 123456) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}

class IsLeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100) != 0);
    }
}

class PrintStars {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}