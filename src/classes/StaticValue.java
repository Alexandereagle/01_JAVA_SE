package classes;

public class StaticValue {
    public static int a = 10;
    public static void printHello(){
        System.out.println(a);
    }
    public StaticValue(){
        a += 1;
    }
}

class StaticTest{
    public static void main(String[] args) {
        StaticValue.a = 100;
        StaticValue staticValue = new StaticValue();
        System.out.println(staticValue.a);
    }
}
