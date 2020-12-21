package classes;

import java.util.Arrays;

public class Class04 {
}

class rectangleArea {
    public static void main(String[] args) {
        method();
        separator();
        System.out.println(methodArea());
        separator();
        System.out.println(methodAreaNum(10, 20));
    }

    public static void separator() {
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println("--------------------------");
    }

    public static void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int methodArea() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public static int methodAreaNum(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return row * column;

    }
}

class AnotherClass {
    public static int rectangleArea(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}

class CallCLass {
    public static void main(String[] args) {
        System.out.println(AnotherClass.rectangleArea(10, 8));
    }
}

class pallet {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a, b执行前的值 a=" + a + " b=" + b);
        add(a, b);
        System.out.println("a, b main函数执行后的值 a=" + a + " b=" + b);
    }

    public static void add(int left, int right) {
        System.out.println("left, right 执行前的值 left=" + left + " right=" + right);
        left += 2;
        right += 2;
        System.out.println("left, right 执行后的值 left=" + left + " right=" + right);
    }
}

class DataSwap {
    public int a;
    public int b;

    @Override
    public String toString() {
        return "DataSwap{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class DataSwapTest {
    public static void swap(DataSwap dataSwap) {
        int temp = dataSwap.a;
        dataSwap.a = dataSwap.b;
        dataSwap.b = temp;
    }

    public static void main(String[] args) {
        DataSwap dataSwap = new DataSwap();
        dataSwap.a = 10;
        dataSwap.b = 20;
        swap(dataSwap);
        System.out.println(dataSwap);
    }
}


class FunctionOverload {
    public static void main(String[] args) {
        System.out.println(mOL(10));
        System.out.println(mOL(10, 20));
        mOL("Hello World");
    }

    public static int mOL(int i) {
        return i * i;
    }

    public static int mOL(int i, int j) {
        return i * j;
    }

    public static void mOL(String i) {
        System.out.println(i);
    }
}

class MaxValue {
    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(20.4, 33.2));
        System.out.println(max(20.4, 30.6, 44));
        System.out.println(max(20.4, 30.6, 44, 100));
    }

    public static int max(int i, int j) {
        return i > j ? i : j;
    }

    public static double max(double i, double j) {
        return i > j ? i : j;
    }

    public static double max(double i, double j, double k) {
        double temp = i > j ? i : j;
        return temp > k ? temp : k;
    }

    public static double max(double... args) {
        double max = args[0];
        for (double left :
                args) {
            max = max > left ? max : left;
        }
        return max;
    }
}

class StringTest {
    public String msg = "good";
    public char[] ch = new char[]{'t', 'e', 's', 't'};

    public static void change(String msg, char[] ch) {
        msg = "test OK";
        ch[0] = 'b';
    }

    @Override
    public String toString() {
        return "StringTest{" +
                "msg='" + msg + '\'' +
                ", ch=" + Arrays.toString(ch) +
                '}';
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        System.out.println(stringTest);
        change(stringTest.msg, stringTest.ch);
        System.out.println(stringTest);
    }
}

