package org.example.algorithms.sort;

public class MergeSort {

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) { // check if there is more than 1 element
            int m = (l + r) / 2; // calculate the middle index
            mergeSort(arr, l, m); // recursively sort the left half
            mergeSort(arr, m + 1, r); // recursively sort the right half
            merge(arr, l, m, r); // merge the two sorted halves
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1; // calculate the length of the left subarray
        int n2 = r - m; // calculate the length of the right subarray

        // create temporary arrays to hold the left and right subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy the left and right halves of the original array into the temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0; // index of the first element in the left subarray
        int j = 0; // index of the first element in the right subarray
        int k = l; // index of the merged array

        // merge the two subarrays by comparing the first elements of each subarray
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy any remaining elements in the left or right subarrays into the merged array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /*
     * The time complexity of Merge Sort is O(n log n), which means that the running time grows proportionally to n
     * multiplied by the logarithm of n. This makes it much faster than bubble sort and selection sort for large datasets.
     *
     * The space complexity of Merge Sort is O(n), since it requires temporary arrays to be created during the merging process.
     * This can make it less memory efficient than other sorting algorithms,
     * such as insertion sort, which sorts the array in place.
     */

    /*
     * When use this algorithm?
     *
     * Merge Sort is a good choice for sorting large datasets where the amount of available memory is not a constraint.
     * It has a time complexity of O(n log n), which is much faster than the quadratic time complexity of sorting
     * algorithms such as bubble sort and insertion sort.
     *
     * Merge Sort is also a stable sorting algorithm, which means that it preserves the relative order of equal elements
     * in the input array. This can be important in certain applications,
     * such as sorting a list of objects by multiple criteria.
     */
}
