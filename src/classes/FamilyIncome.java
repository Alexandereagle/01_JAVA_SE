package classes;

import java.util.Scanner;

public class FamilyIncome {
    public static void main(String[] args) {
        String a = "Hello";
        String b = a + " World";
        System.out.println(b);
    }
}


class FamilyMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean label = false;
        int moneys = 10000;
        String moneyDetails = "收支\t账户金额\t收支金额\t说明\n";
        while (true) {
            PrintMenu();
            System.out.print("请选择1-4: ");
            int choiceType = scanner.nextInt();
            switch (choiceType) {
                case 1:
                    System.out.println(moneyDetails);
                    break;
                case 2:
                    System.out.print("本次收入金额: ");
                    int getMoneys = scanner.nextInt();
                    System.out.print("本次收入说明: ");
                    String getDetail = scanner.next();
                    moneys += getMoneys;
                    moneyDetails = moneyDetails + "收入\t" + moneys + "\t" + getMoneys + "\t" + getDetail + "\n";
                    break;
                case 3:
                    System.out.print("本次支出金额: ");
                    int postMoneys = scanner.nextInt();
                    System.out.print("本次支出说明: ");
                    String postDetail = scanner.next();
                    moneys -= postMoneys;
                    moneyDetails = moneyDetails + "支出\t" + moneys + "\t" + postMoneys + "\t" + postDetail + "\n";
                    break;
                case 4:
                    label = true;
                    break;
                default:
                    break;
            }
            if (label) {
                System.out.print("确认是否退出(Y/N): ");
                char verify = scanner.next().charAt(0);
                if (verify == 'Y') {
                    break;
                } else if (verify == 'N') {
                    label = false;
                }
            }
        }
    }

    public static void PrintMenu() {
        System.out.println("------------家庭收支记账软件-----------");
        System.out.println();
        System.out.println("-----------1、收支明细-----------------");
        System.out.println("-----------2、登记收入-----------------");
        System.out.println("-----------3、登记支出-----------------");
        System.out.println("-----------4、退出--------------------");
    }
}
