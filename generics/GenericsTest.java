package generics;

import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(8);
        arr.add(10);

        /*
        * we can store different type of data in ArrayList but
        * not in the ArrayList with Generics
        * NOTE: So, it is type safe
        */

//      arr.add("suraj");


//        Eceesing the element
        Integer value = arr.get(1);
        System.out.println(value);

        /*
         * we can get element of ArrayList but we need to type cast as it store objects
         * not in the ArrayList with Generics
         * NOTE: So, it is resolve type cast
         */

        for (Object item:arr){
            System.out.println(item);
        }
    }
}
