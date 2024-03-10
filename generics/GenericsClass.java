package generics;

public class GenericsClass {
    public static void main(String[] args) {
        DisplayData<Integer> integerData = new DisplayData<>(10);
        integerData.displayValue();
        integerData.displayData('$');

        DisplayData<String> stringData = new DisplayData<>("Suraj");
        stringData.displayValue();
        stringData.displayData(2);

        DisplayData<Character> charData = new DisplayData<>('@');
        charData.displayValue();
        charData.displayData("Vera");
    }
}

// Generics Class work on the type mention on the object creations
class DisplayData<T>{
    T var;
    DisplayData(T t){
        this.var = t;
    }
    public void displayValue(){
        System.out.println(var);
    }

//    Generics Method can work on the basis of the type of dta parameterized
    public <A> void displayData(A name){
        System.out.println(name);
    }
}
