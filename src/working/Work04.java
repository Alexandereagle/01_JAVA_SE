package working;

import java.util.Scanner;

public class Work04 {
}

class homeworkTest01 {
    public static void main(String[] args) {
        int i = 0;
        int i2 = 10;
        while (i < 5) {
            i++;
            i2++;
            if (i >= 2 && i2 < 15) {
                System.out.println("i:" + i + " i2: " + i2);
            }
        }
        System.out.println("-----------------");
        while (i2 < 20) {
            i++;
            i2++;
            if (i > 8 || i2 <= 18) {
                System.out.println("i:" + i + " i2: " + i2);
            }
        }
    }
}

class homeworkTest02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class homeworkTest03 {
    public static void main(String[] args) {
        int jj = 20;
        int a = 0;
        int b = 0;
        for (int ii = 0; ii < jj; ii += 2, jj--) {
            if (ii % 3 == 0) {
                a = ii;
                System.out.println(ii + " Hello");
            } else {
                b = ii;
                System.out.println(ii + " World");
            }
        }
        System.out.println(a * b);
    }
}

class homeworkTest04 {
    public static void main(String[] args) {
        for (int input = 1; input <= 12; input++) {
            switch (input) {
                case 1:
                    System.out.println(input + "水瓶");
                    break;
                case 2:
                    System.out.println(input + "双鱼");
                    break;
                case 3:
                    System.out.println(input + "白羊");
                    break;
                case 4:
                    System.out.println(input + "金牛");
                    break;
                case 5:
                    System.out.println(input + "双子");
                    break;
                case 6:
                    System.out.println(input + "巨蟹");
                    break;
                case 7:
                    System.out.println(input + "狮子");
                    break;
                case 8:
                    System.out.println(input + "处女");
                    break;
                case 9:
                    System.out.println(input + "天秤");
                    break;
                case 10:
                    System.out.println(input + "天蝎");
                    break;
                case 11:
                    System.out.println(input + "射手");
                    break;
                case 12:
                    System.out.println(input + "摩羯");
                    break;
            }
        }
    }
}

class HomeworkTest005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年:");
        int year = scanner.nextInt();
        System.out.print("请输入月:");
        int month = scanner.nextInt();
        System.out.print("请输入日:");
        int day = scanner.nextInt();
        int sumDays = 0;
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                    sumDays += 29;
                else
                    sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                break;
            default:
                System.out.println("错误的月份");
        }
        System.out.println(year + "年的第" + sumDays);
    }
}

class HomeworkTest006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年:");
        int year = scanner.nextInt();
        System.out.print("请输入月:");
        int month = scanner.nextInt();
        System.out.print("请输入日:");
        int day = scanner.nextInt();
        int sumDays = 0;
        while (year >= 2000) {
            year -= 1;
            switch (month) {
                case 12:
                    sumDays += 30;
                case 11:
                    sumDays += 31;
                case 10:
                    sumDays += 30;
                case 9:
                    sumDays += 31;
                case 8:
                    sumDays += 31;
                case 7:
                    sumDays += 30;
                case 6:
                    sumDays += 31;
                case 5:
                    sumDays += 30;
                case 4:
                    sumDays += 31;
                case 3:
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        sumDays += 29;
                    else
                        sumDays += 28;
                case 2:
                    sumDays += 31;
                case 1:
                    sumDays += day;
                    break;
                default:
                    System.out.println("错误的月份");
            }
        }
        switch (sumDays % 5) {
            case 1:
            case 2:
            case 3:
                System.out.println("打渔");
                break;
            case 4:
            case 0:
                System.out.println("筛网");
                break;
        }
    }
}