package org.example.algorithms.sort;

public class CountingSort {

    public static void countingSort(int[] arr) {
        int n = arr.length;
        int[] count = new int[101]; // Create a counting array of size 101 (to handle values between 0 and 100)
        int[] output = new int[n]; // Create an output array of the same size as the input array

        // Step 1: Count the number of occurrences of each input value
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 2: Modify the counting array to determine the positions of each input value in the output array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place each input value in its correct position in the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted output array back to the input array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    /*
     * Time Complexity:
     * Counting sort has a time complexity of O(n + k),
     * where n is the length of the input array and k is the range of input values.
     * The algorithm involves three passes over the input array: one pass to count the number of occurrences of each value,
     * one pass to modify the counting array to determine the positions of each value in the output array,
     * and one pass to place each value in its correct position in the output array.
     * Each of these passes takes O(n) time, and the size of the counting array is k,
     * so modifying the counting array takes O(k) time.
     * Therefore, the total time complexity is O(n + k).
     *
     * Space Complexity:
     * Counting sort requires O(n + k) extra space for the counting array and output array.
     * This is because the size of the counting array is k, which is the range of input values,
     * and the size of the output array is n, which is the length of the input array.
     *
     * Stability:
     * Counting sort is a stable sorting algorithm, meaning that the order of equal elements is preserved after sorting.
     * This is because the algorithm first counts the number of occurrences of each input value,
     * and then uses this information to determine the positions of each value in the output array.
     */

    /*
     * When use this algorithm.
     *
     * Small range of input values: Counting sort is most effective when the range of input values is small compared to
     * the number of elements being sorted. In this case, the algorithm can create a counting array of size equal to
     * the range of input values, and use it to efficiently sort the input.
     *
     * Integer sorting: Counting sort is often used for sorting integers,
     * especially when the range of input values is known and small.
     * For example, if we need to sort an array of integers between 1 and 100,
     * we can use counting sort to achieve linear-time sorting.
     *
     * Stability: Counting sort is a stable sorting algorithm,
     * meaning that the order of equal elements is preserved after sorting.
     * This property is useful in certain applications,
     * such as database operations where maintaining the order of equal elements is important.
     */
}
