package classes;

/**
 * @author: zhangzhen
 * @version: 1.0
 */
public class Class01 {
    public static void main(String[] args) {
        printString();
        printString("iPhone");
        printString("first", "second", "third", "last one");
        int a = 10;
        if (a == 10)
            a = 12;
        System.out.println("Hello World");

    }

    // 编译: javac Class01.java
    // 运行: java Class01
    static void printString() {
        System.out.println("Hello World");
    }

    static void printString(String firstStr) {
        System.out.println("Hello " + firstStr);
    }

    static void printString(String first, String... args) {
        System.out.println(first);
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            System.out.print(" ");
        }
        for (String inputString : args) {
            System.out.println(inputString);
        }
    }

    public int num = 10;

    public static int sInt = 20;

    Class01() {
        System.out.println("Hello World");
    }


}

class Class01Main {
    public static void main(String[] args) {
        int sInt = Class01.sInt;
        System.out.println(sInt);
        Class01 class01 = new Class01();
        class01.num = 100;

        Class01 class02 = new Class01();
        class02.num = 200;


    }
}

class SumOod {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        System.out.println(sum);
    }
}

class SumSeven {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
                count += 1;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}

class FLower {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i == (i / 100) * (i / 100) * (i / 100) + ((i % 100) / 10) * ((i % 100) / 10) * ((i % 100) / 10) + (i % 10) * (i % 10) * (i % 10)) {
                System.out.print(i + " ");
            }
        }
    }
}

class FLowerWhile {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum += (temp % 10) * (temp % 10) * (temp % 10);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }
    }
}

class FLowerWhileNoLimit {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000000000; i++) {
            int temp = i;
            int times = 0;
            while (temp > 0) {
                temp /= 10;
                times += 1;
            }
            temp = i;
            int sum = 0;
            while (temp > 0) {
                int realTimes = times;
                int mul = 1;
                while (realTimes-- > 0) {
                    mul *= (temp % 10);
                }
                sum += mul;
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }
    }
}

class WhileFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);
        int i = 0;
        sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
        i = 0;
        sum = 0;
        do {
            if (i % 2 == 0)
                sum += i;
            i += 1;
        } while (i <= 100);
        System.out.println(sum);
    }

}
