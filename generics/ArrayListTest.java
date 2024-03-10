package generics;

import java.util.ArrayList;

/** Implementing Arraylist without using the Generics Concept */

public class ArrayListTest {
    public static void main(String[] args) {

//      define ArrayList object
        ArrayList obj = new ArrayList();

//        Add element
        obj.add(20);
        obj.add("suraj");
        obj.add(90.3);

//        Remove element
        obj.remove(1);

//        Print Arraylist
        for(Object item : obj) {
            System.out.println(item);
        }
    }
}

