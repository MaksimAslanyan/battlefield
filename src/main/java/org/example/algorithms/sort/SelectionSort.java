package org.example.algorithms.sort;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum value in the unsorted portion of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum value with the first element in the unsorted portion of the array
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /*
     * Time Complexity:
     * The outer loop runs n-1 times, where n is the length of the array.
     * The inner loop runs n-i-1 times on average, where i is the current index of the outer loop.
     * Therefore, the total number of iterations is:
     * (n-1) + (n-2) + (n-3) + ... + 1 = n(n-1)/2
     * This gives a time complexity of O(n^2), since n^2 is the dominant term.
     *
     * Space Complexity:
     * Selection sort is an in-place algorithm, meaning it does not require any additional memory beyond the input array.
     * Therefore, the space complexity is O(1).
     *
     * Stability:
     * Selection sort is not a stable sorting algorithm,
     * meaning that the order of equal elements may not be preserved after sorting.
     */
}
