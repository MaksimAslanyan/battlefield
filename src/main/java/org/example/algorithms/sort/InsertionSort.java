package org.example.algorithms.sort;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /*
     * Time Complexity:
     * The outer loop runs n-1 times, where n is the length of the array.
     * The inner loop may run from 0 to i-1 times for each iteration of the outer loop, where i is the current value of the loop index.
     * In the worst case, the inner loop runs i-1 times for each value of i from 1 to n-1. This gives a total of:
     * 1 + 2 + 3 + ... + (n-1) = n(n-1)/2
     * This gives a time complexity of O(n^2), since n^2 is the dominant term.
     *
     * Space Complexity:
     * Insertion sort is an in-place algorithm, meaning it does not require any additional memory beyond the input array.
     * Therefore, the space complexity is O(1).
     *
     * Stability:
     * Insertion sort is a stable sorting algorithm, meaning that the order of equal elements is preserved after sorting.
     */

    /*
     * When use this algorithm.
     *
     * Small arrays: Insertion sort is easy to implement and understand,
     * so it may be a good choice for sorting small arrays with fewer than 100 elements.
     *
     * Nearly sorted arrays: If the input array is already nearly sorted,
     * then insertion sort can sort it quickly in O(n) time, where n is the length of the array.
     * This is because the inner loop of insertion sort only needs to move each element one position to the left,
     * instead of swapping adjacent elements as in other sorting algorithms.
     *
     * Online sorting: Insertion sort can be used for online sorting,
     * where elements are added to the array one at a time and need to be sorted immediately.
     * In this scenario, insertion sort can be more efficient than other sorting algorithms that require the entire
     * array to be loaded into memory before sorting can begin.
     */
}
