import myPackage.TestClass1;
import myPackage.TestClass2;

public class TestPackage{
    public static void main(String[] args) {
        TestClass1 tc1 = new TestClass1();
        TestClass2 tc2 = new TestClass2();

        tc1.displayName("Suraj");
        tc2.displayName("Suraj");
    }
}