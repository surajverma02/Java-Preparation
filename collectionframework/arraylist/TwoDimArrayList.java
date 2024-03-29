package collectionframework.arraylist;

import java.util.ArrayList;

public class TwoDimArrayList {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Creating sub-ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Adding element to the Sub-ArrayList
        list1.add(20);
        list1.add(10);
        list1.add(5);

        list2.add(40);
        list2.add(20);
        list2.add(10);

        list3.add(80);
        list3.add(40);
        list3.add(20);

        // Adding Sub-ArrayList into the  main list
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Accessing element of 2D ArrayList
        for (ArrayList<Integer> currList : mainList) {
            for (Integer integer : currList) {
                System.out.println(integer);
            }
        }

    }
}
