package sorting_algorithms;

import java.util.List;

public class InsertionSort {

    public int[] sort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int j = i;
            while(j >= 1 && array[j] < array[j-1]) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
}
