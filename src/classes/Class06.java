package classes;

public class Class06 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class Girl {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy) {
        boy.shout(this);
    }
}

class Boy {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("想吧,咱俩一起想");
    }

    public void shout(Girl girl) {
        if (age < 18) {
            System.out.println("不行, 我还未成年, 犯法");
        } else if (age >= 18 && age < 22) {
            System.out.println("不行,国家不允许");
        } else if (age >= 22 && age < 30) {
            System.out.println("那你带着身份证户口本来吧");
        } else if (age >= 30 && age < 50) {
            System.out.println("不行,我还没离婚");
        } else if (age >= 50 && age <= 80) {
            System.out.println("不行,老伴还活着");
        } else if (age > 80) {
            System.out.println("不行,我没了");
        }
    }
}

class MarryTest {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Boy boy = new Boy();
        girl.setName("翠花");
        boy.setAge(80);
        boy.setName("大壮");
        girl.marry(boy);
        boy.marry(girl);
    }
}

class Person {
    private String name;
    private int age;


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        this.age = 18;
    }

    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person personNoConstruct = new Person();
        personNoConstruct.setAge(10);
        personNoConstruct.setName("李四");
        String name = personNoConstruct.getName();
        int age = personNoConstruct.getAge();
        System.out.println(name);
        System.out.println(age);
        Person personOneConstruct = new Person("王五");
        personOneConstruct.setAge(18);
        Person person = new Person("张三", 18);
        System.out.println(person);
        System.out.println(personNoConstruct);
        System.out.println(personOneConstruct);
    }
}

class TriAngle {
    private double base;
    private double height;

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public TriAngle() {

    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

class TestTriAngle {
    public static double triAngleArea(TriAngle triangle) {
        return triangle.getBase() * triangle.getHeight() / 2;
    }

    public static void main(String[] args) {
        TriAngle triAngleNoConstruct = new TriAngle();
        triAngleNoConstruct.setBase(10);
        triAngleNoConstruct.setHeight(20);
        TriAngle triAngle = new TriAngle(4, 5);
        double area = triAngleArea(triAngle);
        System.out.println(area);
    }
}

class PersonStudent {
    private String name;
    private int age;
    private String school;
    private String major;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getSchool() {
        return school;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public PersonStudent() {

    }

    public PersonStudent(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public PersonStudent(String name, int age, String school) {
        this(name, age);
        this.school = school;
    }

    public PersonStudent(String name, int age, String school, String major) {
        this(name, age, school);
        this.major = major;
    }

    @Override
    public String toString() {
        return "PersonStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

class PersonStudentTest {
    public static void main(String[] args) {
        PersonStudent person = new PersonStudent();

        PersonStudent person1 = new PersonStudent("张三", 18);

        PersonStudent person2 = new PersonStudent("李四", 18, "清华大学");

        PersonStudent person3 = new PersonStudent("王五", 18, "清华大学", "计算机科学");

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}


class Room {
    private int houseNo;
    private double houseArea;
    private String houseAddress;

    public String getDetails() {
        System.out.println("houseNo:" + houseNo + ", houseArea: " + houseArea + ", houseAddress: " + houseAddress);
        return "houseNo:" + houseNo + ", houseArea: " + houseArea + ", houseAddress: " + houseAddress;
    }

    public Room() {
        getDetails();
    }

    public Room(int houseNo) {
        this();
        this.houseNo = houseNo;
        getDetails();
    }

    public Room(int houseNo, double houseArea) {
        this(houseNo);
        this.houseArea = houseArea;
        getDetails();
    }

    public Room(int houseNo, double houseArea, String houseAddress) {
        this(houseNo, houseArea);
        this.houseAddress = houseAddress;
        getDetails();
    }

    public double getHouseArea() {
        return houseArea;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public void setHouseArea(double houseArea) {
        this.houseArea = houseArea;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getHouseAddress() {
        return houseAddress;
    }
}

class TestRoom {
    public static void main(String[] args) {
        Room room = new Room();
        Room room1 = new Room(1);
        Room room2 = new Room(2, 100.0);
        Room room3 = new Room(3, 100.0, "北京市昌平区");
    }
}


class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足");
        } else {
            balance -= amount;
            System.out.println("成功取出: " + amount);
        }
    }

    public void deposit(double amount) {
        System.out.println("成功存入: " + amount);
        balance += amount;
    }

    @Override
    public String toString() {
        return "id is " + id + ", annualInterestRate is " + annualInterestRate*100 + "%, balance is " + balance;
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    @Override
    public String toString() {
        return "Customer[" + lastName + ", " + firstName + ']' + "has a account:" + account;
    }

    public Customer() {

    }

    public Customer(String f, String l) {
        this();
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(int id, double balance, double annualInterestRate) {
        account = new Account(id, balance, annualInterestRate);
    }

    public Account getAccount() {
        return account;
    }
}

class TestCustomerAccount {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        customer.setAccount(1000, 2000, 0.0123);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println(customer);
    }
}
