package sorting;

// for using the methods of array
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 3, 6, 2};
        System.out.println(Arrays.toString(arr));

        // Implementing Selection Sort
        String result = Arrays.toString(selectionSort(arr));
        System.out.println(result);
    }

    // Selection Sort
    public static int[] selectionSort(int[] arr){
        // loop for the minimum number from loop
        for(int i=0; i<arr.length-1; i++){

            int min = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
