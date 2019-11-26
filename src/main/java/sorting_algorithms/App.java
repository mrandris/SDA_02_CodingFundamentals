package sorting_algorithms;

public class App {
    public static void main(String[] args) {
        int[] array = new int[]{3,0,1,8,7,2,6,4,9,5};

/** bubble sort **/
        /*BubbleSort bubble = new BubbleSort();

        System.out.print("Unsorted: ");
        printArray(array);

        bubble.sort(array);
        System.out.print("Sorted: ");
        printArray(array);*/

/** merge sort **/
        /*MergeSort merge = new MergeSort();

        System.out.println("Original array: ");
        printArray(array);
        System.out.println("Sorted array:");
        printArray(merge.sort(array));*/

/** insertion sort **/
        /*InsertionSort insertion = new InsertionSort();

        System.out.println("Original array: ");
        printArray(array);
        System.out.println("Sorted array:");
        printArray(insertion.sort(array));*/

/** quick sort **/
//        QuickSort quicky = new QuickSort();
//
//        printArray(array);
//        printArray(quicky.sort(array));
//
//        System.out.println();
//        System.out.println();
//        System.out.println();

        ProperQuickSort quick = new ProperQuickSort();

        System.out.println("Original array: ");
        printArray(array);
        System.out.println("Sorted array:");

        printArray(quick.sort(array));

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
