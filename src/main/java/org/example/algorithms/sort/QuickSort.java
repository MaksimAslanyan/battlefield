package org.example.algorithms.sort;

public class QuickSort {

    /**
     * This is an implementation of the QuickSort algorithm that sorts an array of integers in ascending order.
     * The time complexity of this algorithm is O(n log n) on average and O(n^2) in the worst case.
     * The space complexity of this algorithm is O(log n) on average and O(n) in the worst case.
     *
     * @param arr the array to sort
     * @param low the index of the first element in the subarray to sort
     * @param high the index of the last element in the subarray to sort
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Choose a pivot element and partition the subarray
            int pivotIndex = partition(arr, low, high);
            // Recursively sort the left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * This helper method chooses a pivot element and partitions the subarray such that all elements
     * less than the pivot are to its left and all elements greater than the pivot are to its right.
     *
     * @param arr the array to partition
     * @param low the index of the first element in the subarray to partition
     * @param high the index of the last element in the subarray to partition
     * @return the index of the pivot element
     */

    public static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (the pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // Return the index of the pivot
        return i + 1;
    }

    /*
     * In this implementation of QuickSort, we recursively partition the array and sort the resulting subarrays until
     * the entire array is sorted in ascending order. The time complexity of QuickSort is O(n log n) on average,
     * which means that the amount of time it takes to run the algorithm grows at most logarithmically with the size of
     * the input array. However, in the worst case (when the pivot element always partitions the array into two
     * subarrays of size 1 and n-1), the time complexity is O(n^2), which means that the amount of time it takes to run
     * the algorithm grows quadratically with the size of the input array. The space complexity of QuickSort is O(log n)
     * on average, which means that the amount of memory used by the algorithm grows logarithmically with the size of
     * the input array. However, in the worst case (when the recursion depth is n), the space complexity is O(n),
     * which means that the amount of memory used by the algorithm grows linearly with the size of the input array.
     */

}
