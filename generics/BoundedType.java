package generics;

public class BoundedType {
    public static void main(String[] args) {
        BoundedTest<Integer> test1 = new BoundedTest<>(10);
        test1.displayValue();

        BoundedTest<Double> test3 = new BoundedTest<>(100.2);
        test3.displayValue();

        BoundedTest<Number> test4 = new BoundedTest<>(10);
        BoundedTest<Number> test5 = new BoundedTest<>(10.22f);

//        BoundedTest<String> test2 = new BoundedTest<>("Suraj");
//        test2.displayValue();

//        Class is executed for all type of data without bound but if we use bound, its get restricted
    }
}

class BoundedTest<T extends Number>{
    T var;
    BoundedTest(T t){

        this.var = t;
    }
    public void displayValue(){

        System.out.println(var);
    }
}


