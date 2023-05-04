package org.example.algorithms.sort;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                // Compare adjacent elements and swap them if they are in the wrong order
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            n--; // Reduce the size of the unsorted portion of the array
        }
    }

    /*
     * Time Complexity:
     * The outer loop runs at most n times, where n is the length of the array.
     * The inner loop runs n-1 times in the worst case on the first iteration, then n-2 times on the second iteration,
     * and so on, down to 1 time on the last iteration.
     * Therefore, the total number of iterations is:
     * (n-1) + (n-2) + (n-3) + ... + 1 = n(n-1)/2
     * This gives a time complexity of O(n^2), since n^2 is the dominant term.
     *
     * Space Complexity:
     * Bubble sort is an in-place algorithm, meaning it does not require any additional memory beyond the input array.
     * Therefore, the space complexity is O(1).
     *
     * Stability:
     * Bubble sort is a stable sorting algorithm, meaning that the order of equal elements is preserved after sorting.
     */

    /*
     * When use this algorithm
     *
     * Small arrays: Bubble sort is easy to implement and understand,
     * so it may be a good choice for sorting small arrays with fewer than 100 elements.
     *
     * Already sorted or nearly sorted data: If the data is already sorted or nearly sorted,
     * bubble sort can perform well, because it has a best-case time complexity of O(n),
     * where n is the number of elements.
     */
}
