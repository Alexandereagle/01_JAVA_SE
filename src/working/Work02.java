package working;

public class Work02 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}

class Test1 {
    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 2;
        int b3 = b1 + b2;
        System.out.println("b3的结果是: " + b3);

        short s1 = 1000;
        short s2 = 2000;
        int s3 = s1 + s2;
        System.out.println("s3的结果是: " + s3);

        char ch1 = 'a';
        int i1 = 30;
        int ch3 = ch1 - i1;
        System.out.println("ch3的结果是: " + ch3);
    }
}

//第二题
class Test2 {
    public static void main(String[] args) {
        int i1 = 10;
        long l1 = 1000;
        long add = i1 + l1;
        System.out.println("add的结果为: " + add);

        long l2 = 10002;
        float f2 = 12.222F;
        float add2 = l2 + f2;
        System.out.println("add2的结果为: " + add2);

        int i3 = 100;
        double d3 = 2.444D;
        double add3 = i3 + d3;
        System.out.println("add3的结果为: " + add3);

        float f4 = 30.2F;
        double d4 = 30.22D;
        double add4 = f4 + d4;
        System.out.println("add4的结果为: " + add4);

    }
}

//第三题
class Test3 {
    public static void main(String[] args) {
        char ch = 'J';
        System.out.println((char) (ch + ('a' - 'A')));

        char ch2 = 'a';
        ch2 += ('A' - 'a');
        System.out.println(ch2);

        double d3 = 10.2D;
        int i3 = 11;
        double sum3 = d3 + i3;
        System.out.println("sum3 为: " + sum3);
        System.out.println("sum3 的整数为" + (int) sum3);

        double d4 = 11.4D;
        int i4 = 12;
        double sum4 = d4 + i4;
        System.out.println("sum4 的整数为: " + (int) sum4);
    }
}

class Test4 {
    public static void main(String[] args) {
        int a1 = 10, a2 = 11;
        System.out.println("a1 是偶数:" + (a1 % 2 == 0));
        System.out.println("a2 是偶数:" + (a2 % 2 == 0));
        System.out.println("a1 是奇数:" + (a1 % 2 == 1));
        System.out.println("a2 是奇数:" + (a2 % 2 == 1));
    }
}

class Test5 {
    public static void main(String[] args) {
        int a = 20, b = 20;
        boolean bo = ((++a % 3 == 0) && (a++ % 7 == 0));
        System.out.println(bo);
        System.out.println(a);

        boolean bo2 = ((b++ % 3 == 0) && (++b % 7 == 0));
        System.out.println(bo2);
        System.out.println(b);
    }
}

class Test6 {
    public static void main(String[] args) {
        int hours = 89;
        System.out.println(hours / 24 + "天，余" + hours % 24 + "小时");
    }
}

class Test7 {
    public static void main(String[] args) {
        int today = 2;
        int gapDay = 100;
        System.out.println("今天是周" + today + " ," + gapDay + "天后是周" + (today + gapDay) % 7);
    }
}

class Test8 {
    public static void main(String[] args) {
        int x = 10;
        int y = 1000;
        int z = 200;
        int middle = x > y ? x : y;
        System.out.println(x + "," + y + "," + z + "的最大值是: " + (middle > z ? middle : z));
    }
}

class Test9 {
    public static void main(String[] args) {
        int year = 2000;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}

class Test10 {
    public static void main(String[] args) {
        double hua = 80;
        double she;
        she = (hua - 32) / 1.8;
        System.out.println(hua + "℉ 是" + she + "℃");
    }
}

class Test11 {
    public static void main(String[] args) {
        int i = 1;
        i *= 0.2;
        i++;
        System.out.println(i);
    }
}

class Test12 {
    public static void main(String[] args) {
        int i = 2;
        i += --i;

        int j = 2;
        j *= j + 1;

        int k = 2;
        k *= ++k + ++k;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}

//class Test13 {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        if (a = b) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("not Equal");
//        }
//    }
//}

class Test14 {
    public static void main(String[] args) {
        int a = 8, b = 3;
        System.out.println(a >>> b);
        System.out.println(a >>> 3 | 2);
    }
}