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

        int a = 10;
        int b = 20;
        max(a, b);

    }

    public static int max(int a, int b) {

        return a > b ? a : b;
    }
}


class Student {
    String name;
    char gender;
    int age;
    int id;
    double score;

    String say() {
        return "姓名: " + name + "性别: " + name + " 年龄: " + age + " id: " + id + " 成绩: " + score;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.gender = '男';
        student.age = 18;
        student.id = 1;
        student.score = 100.9;
        System.out.println(student.say());
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);
        System.out.println(student.id);
        System.out.println(student.score);
    }
}

class Dog {
    String name;
    int age = 1;
    double weight = 0;

    String say() {
        return "name:" + name + " age:" + age + " weight:" + weight;
    }
}

class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.say());
        Dog dog2 = new Dog();
        System.out.println(dog2.say());

        dog.name = "京巴";
        dog2.name = "吉娃娃";
        dog2.weight = 8;
        System.out.println(dog.say());
        System.out.println(dog2.say());
    }
}

class Num1 {
    public int a;
    public int b;

    public String say() {
        return "a: " + a + ", b: " + b;
    }
}

class TestNum1 {
    public static void main(String[] args) {
        Num1 n1 = new Num1();
        System.out.println("调用函数执行前的值" + n1.say());
        add(n1);
        System.out.println("调用函数执行后的值" + n1.say());

    }

    public static void add(Num1 n1) {
        System.out.println("函数执行前的值" + n1.say());
        n1.a += 1;
        n1.b += 2;
        System.out.println("函数执行后的值" + n1.say());
    }
}

class Circle {
    private final double PI = 3.14159265357939788292;
    public double radius;

    public double findArea() {
        return radius * radius * PI;
    }
}

class PassObject {
    public static void printAreas(Circle c, int times) {
        System.out.println("Radius" + "\t" + "Area");
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println(i + "\t\t" + c.findArea());
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        printAreas(c, 5);
    }
}

class Persion {
    private int age;
    int b = 10;
    protected int c = 20;
    private int d = 30;

    public void setAge(int i) {
        this.age = i;
    }

    public int getAge() {
        return age;
    }
}

class TestPersion<T> {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.b = 10;
        persion.setAge(18);
        System.out.println(persion.getAge());
    }

    public T add(T left, T right) {
        return left;
    }
}
