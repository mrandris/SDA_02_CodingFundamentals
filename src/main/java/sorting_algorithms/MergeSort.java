package sorting_algorithms;

public class MergeSort {
/** test dividing array **/
    // left array
    public int[] getLeftArray(int[] array) {
        int[] leftArray = new int[array.length/2];
        for(int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }
        return  leftArray;
    }
    // right array
    public int[] getRightArray(int[] array) {
        int[] rightArray = new int[array.length - array.length/2];
        for(int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[array.length/2 + i];
        }
        return  rightArray;
    }

    public int[] sort(int[] array) {
        if(array.length < 2) {
            return array;
        } else {
            // left array
            int[] leftArray = new int[array.length / 2];
            for (int i = 0; i < leftArray.length; i++) {
                leftArray[i] = array[i];
            }
            // right array
            int[] rightArray = new int[array.length - array.length / 2];
            for (int i = 0; i < rightArray.length; i++) {
                rightArray[i] = array[array.length / 2 + i];
            }

            sort(leftArray);
            sort(rightArray);

            return mergeArrays(sort(leftArray), sort(rightArray));
        }
    }

    private int[] mergeArrays(int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        int[] array = new int[leftArray.length + rightArray.length];
        while(i < leftArray.length && j < rightArray.length) {
            if(leftArray[i]<rightArray[j]) {
                array[k] = leftArray[i];
                k++;
                i++;
            } else {
                array[k] = rightArray[j];
                k++;
                j++;
            }
        }
        while(i < leftArray.length) {
            array[k] = leftArray[i];
            k++;
            i++;
        }
        while(j < rightArray.length) {
            array[k] = rightArray[j];
            k++;
            j++;
        }

        return array;
    }
}
