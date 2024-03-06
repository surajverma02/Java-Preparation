import myPackage.*;
import myPackage.TestClass2;
import interference.*;

public class TestPackage{
    public static void main(String[] args) {
        TestClass1 tc1 = new TestClass1();
        TestClass2 tc2 = new TestClass2();

        /*
        NOTE: as a java file is has only one public class so other classes arenot visible outside the package
         */
        // InnerTestClass1 itc1 = new InnerTestClass1();

        tc1.displayName("Suraj");
        tc2.displayName("Suraj");

        // Checking interface class
        TestInterface ti = new TestInterface();
        ti.authorDisplay();
    }
}