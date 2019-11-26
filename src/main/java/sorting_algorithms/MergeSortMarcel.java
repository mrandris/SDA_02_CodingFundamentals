package sorting_algorithms;

public class MergeSortMarcel {
    public void sort(int[] toBeSorted, int sizeOfList) {
        if (sizeOfList < 2) {
            return;
        }
        int mid = sizeOfList / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[sizeOfList - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = toBeSorted[i];
        }
        for (int i = mid; i < sizeOfList; i++) {
            rightArray[i - mid] = toBeSorted[i];
        }

        sort(leftArray, mid);
        sort(rightArray, sizeOfList - mid);

        merge(toBeSorted, leftArray, rightArray, mid, sizeOfList - mid);

    }

    private void merge(int[] toBeSorted, int[] leftArray, int[] rightArray, int leftSize, int rightSize) {
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                toBeSorted[k++] = leftArray[i++];
            } else {
                toBeSorted[k++] = rightArray[j++];
            }
        }

        while (i < leftSize) {
            toBeSorted[k++] = leftArray[i++];
        }

        while (j < rightSize) {
            toBeSorted[k++] = rightArray[j++];
        }
        for(int arr : toBeSorted) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}

