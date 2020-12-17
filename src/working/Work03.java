package working;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int inputInt = scanner.nextInt();
        if (inputInt % 2 == 0) {
            System.out.println(inputInt + "是偶数");
        } else {
            System.out.println(inputInt + "是奇数");
        }
    }
}

class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符:");
        char chInput = scanner.next().charAt(0);
        if ((chInput >= 'a' && chInput <= 'z') || (chInput >= 'A' && chInput <= 'Z')) {
            System.out.println(chInput + "是一个字母");
        } else if (chInput >= '0' && chInput <= '9') {
            System.out.println(chInput + "是一个数字");
        } else {
            System.out.println(chInput + "是其他字符");
        }
    }
}

class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入总价格: ");
        double price = scanner.nextDouble();
        System.out.println("总价格: " + price);

        if (price >= 500) {
            System.out.println("折扣后总价格: " + price * 0.5);
        } else if (price >= 400) {
            System.out.println("折扣后总价格: " + price * 0.6);
        } else if (price >= 300) {
            System.out.println("折扣后总价格: " + price * 0.7);
        } else if (price >= 200) {
            System.out.println("折扣后总价格: " + price * 0.8);
        } else if (price >= 0) {
            System.out.println("折扣后总价格: " + price * 1.0);
        } else {
            System.out.println("输入有误");
        }
    }
}

class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份");
        int month = scanner.nextInt();
        System.out.print("请输入日期");
        int day = scanner.nextInt();

        int data = month * 100 + day;

        if (data >= 321 && data <= 419) {
            System.out.println("生日" + month + "月" + day + "日是白羊座");
        } else if (data >= 420 && data <= 520) {
            System.out.println("生日" + month + "月" + day + "日是金牛座");
        } else if (data >= 521 && data <= 621) {
            System.out.println("生日" + month + "月" + day + "日是双子座");
        } else if (data >= 622 && data <= 722) {
            System.out.println("生日" + month + "月" + day + "日是巨蟹座");
        } else if (data >= 723 && data <= 822) {
            System.out.println("生日" + month + "月" + day + "日是狮子座");
        } else if (data >= 823 && data <= 922) {
            System.out.println("生日" + month + "月" + day + "日是处女座");
        } else if (data >= 923 && data <= 1023) {
            System.out.println("生日" + month + "月" + day + "日是天秤座");
        } else if (data >= 1024 && data <= 1122) {
            System.out.println("生日" + month + "月" + day + "日是天蝎座");
        } else if (data >= 1123 && data <= 1221) {
            System.out.println("生日" + month + "月" + day + "日是射手座");
        } else if (data >= 1222 || data <= 119) {
            System.out.println("生日" + month + "月" + day + "日是摩羯座");
        } else if (data >= 120 && data <= 218) {
            System.out.println("生日" + month + "月" + day + "日是水瓶座");
        } else if (data >= 219 && data <= 320) {
            System.out.println("生日" + month + "月" + day + "日是双鱼座");
        }

    }
}

class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年: ");
        int year = scanner.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println(year + "年属猴");
                break;
            case 1:
                System.out.println(year + "年属鸡");
                break;
            case 2:
                System.out.println(year + "年属狗");
                break;
            case 3:
                System.out.println(year + "年属猪");
                break;
            case 4:
                System.out.println(year + "年属鼠");
                break;
            case 5:
                System.out.println(year + "年属牛");
                break;
            case 6:
                System.out.println(year + "年属虎");
                break;
            case 7:
                System.out.println(year + "年属兔");
                break;
            case 8:
                System.out.println(year + "年属龙");
                break;
            case 9:
                System.out.println(year + "年属蛇");
                break;
            case 10:
                System.out.println(year + "年属马");
                break;
            case 11:
                System.out.println(year + "年属羊");
                break;
            default:
                System.out.println(year + "年属猫");
                break;
        }
    }
}

class Test06 {
    public static void main(String[] args) {
        int monthsDays[] = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < monthsDays.length; i++) {
            monthsDays[i] += monthsDays[i - 1];
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份: ");
        int month = scanner.nextInt();

        System.out.print("请输入日期: ");
        int data = scanner.nextInt();

        int day = monthsDays[month - 1] + data;
        switch (day % 7) {
            case 0:
                System.out.print(month + "月 " + data + "日 是星期一");
                break;
            case 1:
                System.out.print(month + "月 " + data + "日 是星期二");
                break;
            case 2:
                System.out.print(month + "月 " + data + "日 是星期三");
                break;
            case 3:
                System.out.print(month + "月 " + data + "日 是星期四");
                break;
            case 4:
                System.out.print(month + "月 " + data + "日 是星期五");
                break;
            case 5:
                System.out.print(month + "月 " + data + "日 是星期六");
                break;
            case 6:
                System.out.print(month + "月 " + data + "日 是星期日");
                break;
            default:
                System.out.print(month + "月 " + data + "日 是星期八");
                break;
        }
    }
}
