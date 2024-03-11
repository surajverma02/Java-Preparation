package interference;

interface InnerTestInterface {
    String author = "Suraj";
    void nameDisplay(String name);   
}

public class TestInterface {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.nameDisplay("Raj");
        System.out.println("Author's name is: " + InnerTestInterface.author);
    }

    public void authorDisplay(){
        System.out.println("Author of the interface is: " + InnerTestInterface.author);
    }
}

class Test1 implements InnerTestInterface {
    public void nameDisplay(String name){
        System.out.println("Hi, " + name);
    }
}
