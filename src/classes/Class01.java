package classes;

public class Class01 {
    public static void main(String[] args) {
        printString();
        printString("iPhone");
        printString("first", "second", "third", "last one");
        int a = 10;
        if (a == 10)
            a = 12;
    }

    // 编译: javac Class01.java
    // 运行: java Class01
    static void printString(){
        System.out.println("Hello World");
    }

    static void printString(String firstStr){
        System.out.println("Hello " + firstStr);
    }

    static void printString(String first, String ...args){
        System.out.println(first);
        for (int i = 0; i < args.length; i++){
            System.out.print(args[i]);
            System.out.print(" ");
        }
    }
}
