package collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {

        // Created ArrayList -> list
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add(10);
        list.add(15);
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list);

        // Getting elements from ArrayList
        System.out.println(list.getFirst());
        System.out.println(list.get(2));
        System.out.println(list.getLast());

        // remove elements from ArrayList
        list.remove(2);
        System.out.println(list);

        // set elements in ArrayList at a index
        list.set(1, 22);
        System.out.println(list);
        // list.set(6, 22); Out Of Bound

        // Check element is in ArrayList or not
        System.out.println(list.contains(10));
        System.out.println(list.contains(20));

        // Size of ArrayList
        System.out.println(list.size());

        // Iterate ArrayList -> ascending
        for(Integer element:list){
            System.out.println(element);
        }

        // Iterate ArrayList -> descending
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }

        // Maximum from ArrayList
        int maxValue = maxElement(list);
        System.out.println("Maximum element form ArrayList is " + maxValue);

        // Sort the ArrayList -> ascending order
        Collections.sort(list);
        System.out.println(list);

        // Sort the ArrayList -> descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }

    public static int maxElement(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;

        for (Integer integer : list) {
            max = Math.max(max, integer);
        }
        return max;
    }
}
