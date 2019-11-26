package sorting_algorithms;

public class QuickSort {

    public int[] sort(int[] array) {
        if(array.length > 1) {
            int pivot = partition(array);
            System.out.println("After first partition:");
            printArray(array);
            System.out.println("Pivot:" + array[pivot] + " Pivot: " + pivot);
            int low = pivot;
            int high = pivot+1;

            sortLow(array, low);
            sortHigh(array, high);

        }
        return array;
    }

    public int partition(int[] array) {
        int i = 0;
        int temp;
        for(int j = 0; j < array.length; j++) {
            if(array[j] < array[array.length-1]) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        if(array[i] > array[array.length-1]) {
            temp = array[i];
            array[i] = array[array.length-1];
            array[array.length-1] = temp;
        }
        return i;
    }

    private int[] sortLow(int[] array, int low) {
        if(low > 0) {
            low = partitionLow(array, low);
            sortLow(array, low);
        }
        return array;
    }

    private int[] sortHigh(int[] array, int high) {
        if(high < array.length-1) {
            high = partitionHigh(array, high);
            sortHigh(array, high);
        }
        return array;
    }

    private int partitionLow(int[] array, int low) {
        int i = 0;
        int temp;
        for(int j = 0; j < low; j++) {
            if(array[j] < array[low-1]) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        if(array[i] > array[low-1]) {
            temp = array[i];
            array[i] = array[low-1];
            array[low-1] = temp;
        }
        return i;
    }

    private int partitionHigh(int[] array, int high) {
        int i = high;
        int temp;
        for(int j = high; j < array.length; j++) {
            if(array[j] < array[array.length-1]) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        if(array[i] > array[array.length-1]) {
            temp = array[i];
            array[i] = array[array.length-1];
            array[array.length-1] = temp;
        }
        return i;
    }

    public int partition2(int[] array, int low, int high) {
        int i = low;
        int temp;
        for(int j = low; j < high; j++) {
            if(array[j] < array[high-1]) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        if(array[i] > array[high-1]) {
            temp = array[i];
            array[i] = array[high-1];
            array[high-1] = temp;
        }
        return i;
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
