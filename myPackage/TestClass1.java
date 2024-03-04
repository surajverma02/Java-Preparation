package myPackage;

public class TestClass1{
    public void displayName(String name){
        System.out.println("Hi, " + name);
    }

    public static void main(String[] args) {
        InnerTestClass1 obj = new InnerTestClass1();
        obj.displayAge(20);
    }
}

class InnerTestClass1 {
    public void displayAge(int age){
        System.out.println("Your age is : " + age);
    }
}