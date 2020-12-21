package classes;

public class StaticValue {
    public static int a = 10;

    public static void printHello() {
        System.out.println(a);
    }

    public StaticValue() {
        a += 1;
    }

}

class StaticTest {
    public static void main(String[] args) {
        StaticValue.a = 100;
        StaticValue staticValue = new StaticValue();
//        System.out.println(staticValue.a);

        int[] a = new int[10];
        char c[] = new char[10];
        System.out.println(a);
        System.out.println("H");
        System.out.println(c);
        System.out.println("W");

        int c1 = 10;
        switch (c1) {
            case 10:
                System.out.println("a is true");
                break;
            case 10 + 1:
                System.out.println("b is true");
                break;
        }

        checkNumber("a", "b", "Hello world");

    }

    public static void checkNumber(String... args) {
        for (String input : args) {
            System.out.println(input);
        }
    }
}
