package working;

public class Work06 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class Employee {
    int no;
    String name;
    int age;
    int salary;

    public Employee() {

    }

    public Employee(int no, String name, int age, int salary) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class Work06Test01 {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "张三", 23, 10000);

        System.out.println("员工" + employee.no + "的编号:" + employee.no + ",姓名:" + employee.name + ",年龄:" + employee.age + ", 薪资:" + employee.salary);

        Employee employee1 = new Employee();
        employee1.no = 2;
        employee1.name = "李四";
        employee1.age = 22;
        employee1.salary = 11000;
        System.out.println("员工" + employee1.no + "的编号:" + employee1.no + ",姓名:" + employee1.name + ",年龄:" + employee1.age + ", 薪资:" + employee1.salary);

    }
}

class MyDate {
    int year;
    int month;
    int day;

    boolean isLeapYear() {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    void set(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    void plus(int years, int months, int days) {
        year += years;
        month += months;
        day += days;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

class Work06Test02 {
    public static void main(String[] args) {
        MyDate birthday = new MyDate();
        birthday.year = 1998;
        birthday.month = 1;
        birthday.day = 11;

        MyDate comeShangguigu = new MyDate();
        comeShangguigu.year = 2020;
        comeShangguigu.month = 12;
        comeShangguigu.day = 13;

        MyDate leaveShangguigu = new MyDate();
        leaveShangguigu.year = 2021;
        leaveShangguigu.month = 6;
        leaveShangguigu.day = 13;
        System.out.println(birthday.year + "-" + birthday.month + "-" + birthday.day);
        System.out.println(comeShangguigu.year + "-" + comeShangguigu.month + "-" + comeShangguigu.day);
        System.out.println(leaveShangguigu.year + "-" + leaveShangguigu.month + "-" + leaveShangguigu.day);
    }
}

class Citizen {
    String name;
    MyDate birthday;
    String no;

    public String toString() {
        return name + ", " + birthday + "," + no;
    }
}

class Work06Test03 {
    public static void main(String[] args) {
        Citizen father = new Citizen();
        father.name = "zhang";
        father.birthday = new MyDate(1966, 9, 9);
        father.no = "610115";
        System.out.println(father);
    }
}

class Work06Test04 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(1966, 9, 9);
        myDate.set(2020, 4, 1);
        System.out.println(myDate);
        System.out.println(myDate.isLeapYear());
        myDate.plus(1, 1, 1);
        System.out.println(myDate);
    }
}

class Triangle {
    double a;
    double b;
    double c;

    public Triangle() {

    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isRightTriangle() {
        return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b);
    }

    boolean isIsoscelesTriangle() {
        return ((a == b) || (a == c) || (b == c));
    }

    boolean isEquilateralTriangle() {
        return ((a == b) && (b == c) && (a == c));
    }

    double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt((p - a) * (p - b) * (p - c));
    }

    double getLength() {
        return a + b + c;
    }
}

class Work06Test05 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 3;
        triangle.c = 3;
        System.out.println(triangle.isRightTriangle());
        System.out.println(triangle.isIsoscelesTriangle());
        System.out.println(triangle.isEquilateralTriangle());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getLength());
    }
}

class MathTools {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiple(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    int remainder(int a, int b) {
        return a % b;
    }

    int max(int a, int b) {
        return a > b ? a : b;
    }

    int min(int a, int b) {
        return a < b ? a : b;
    }

    boolean equals(int a, int b) {
        return a == b;
    }

    boolean isEven(int a) {
        return (a % 2) == 2;
    }

    boolean isPrimeNumber(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    int round(double d) {
        int c = (int) (d * 10);
        int x = c / 10;
        return x + (c % 10 > 4 ? 1 : 0);
    }
}

class Work06Test06 {
    public static void main(String[] args) {
        MathTools mathTools = new MathTools();
        System.out.println(mathTools.add(1, 2));
        System.out.println(mathTools.subtract(1, 2));
        System.out.println(mathTools.multiple(1, 2));
        System.out.println(mathTools.divide(2, 1));
        System.out.println(mathTools.remainder(3, 2));
        System.out.println(mathTools.max(1, 4));
        System.out.println(mathTools.min(4, 1));
        System.out.println(mathTools.equals(1, 2));
        System.out.println(mathTools.isEven(6));
        System.out.println(mathTools.isPrimeNumber(11437));
        System.out.println(mathTools.round(11.503));
    }
}

class MyArrays {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    int[] copy(int[] arr, int len) {
        int[] arrNew = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew = arr;
        return arrNew;
    }
}

class work06Test07 {
    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();
        int[] a = {2, 4, 6, 8, 0, 9, 7, 5, 3, 1};
        System.out.println(myArrays.indexOf(a, 7));
        myArrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(myArrays.indexOf(a, 7));
        myArrays.copy(a, 20);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

class DateCommonsTools {
    String getWeekName(int week) {
        switch (week) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
        return "what";
    }

    String getMonthName(int month) {
        switch (month) {
            case 1:
                return "Janudry";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "What";
    }

    int getTotalDaysOfMonth(int year, int month) {
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        switch (month) {
            case 1:
                return 31;
            case 2:
                return isLeapYear ? 29 : 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return -1;
    }

    int getTotalDaysOfYear(int year) {
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear) {
            return 366;
        } else {
            return 365;
        }
    }

    boolean isLeapYear(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}

class work06Test08 {
    public static void main(String[] args) {
        DateCommonsTools dateCommonsTools = new DateCommonsTools();
        System.out.println(dateCommonsTools.getMonthName(1));
        System.out.println(dateCommonsTools.getWeekName(3));
        System.out.println(dateCommonsTools.getTotalDaysOfMonth(2020, 11));
        System.out.println(dateCommonsTools.getTotalDaysOfYear(2004));
        System.out.println(dateCommonsTools.isLeapYear(200));
    }
}
