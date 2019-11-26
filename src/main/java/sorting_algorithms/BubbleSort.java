package sorting_algorithms;

public class BubbleSort {
    public int[] sort(int[] array) {
        int temp;
        for(int j = array.length-1; j > 0; j--) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
