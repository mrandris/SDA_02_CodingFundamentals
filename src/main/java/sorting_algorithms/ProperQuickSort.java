package sorting_algorithms;

public class ProperQuickSort {

    public int[] sort(int[] array) {
        int low = 0;
        int high = array.length-1;

        sortRecursive(array, low, high);

        return array;
    }

    public void sortRecursive(int[] array, int low, int high) {
//        if(low < high) { /** uncomment this and ... **/
        int pivot = partition(array, low, high);
        if(high > pivot && low < pivot) { /* ... and comment this, to work properly */
            sortRecursive(array, low, pivot-1);
            sortRecursive(array, pivot+1, high);
        }
    }

    public int partition(int[] array, int low, int high) {
        int i = low;
        int temp;
        for(int j = low; j < high; j++) {
            if(array[j] < array[high]) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        temp = array[i];
        array[i] = array[high];
        array[high] = temp;

        return i;
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
