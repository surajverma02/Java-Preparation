package sorting;

// for using methods of arrays
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 4, 6};
        System.out.println(Arrays.toString(arr));

        String result = Arrays.toString(bubbleSort(arr));
        System.out.println(result);
    }

    // Selection Sort
    public static int[] bubbleSort(int[] arr){
        // loop for the checking number for the sweaping
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i;j++){
                
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
