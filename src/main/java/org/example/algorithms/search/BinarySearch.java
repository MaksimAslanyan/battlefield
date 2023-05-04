package org.example.algorithms.search;

public class BinarySearch {


    /**
     * Searches for the index of the target value in the sorted array using binary search.
     * @param arr the sorted array to search
     * @param target the value to search for
     * @return the index of the target value, or -1 if the target value is not found
     */
    public static int binarySearch(int[] arr, int target) {
        // Initialize the search range
        int left = 0;
        int right = arr.length - 1;

        // While the search range is not empty
        while (left <= right) {
            // Compute the middle index of the search range
            int mid = left + (right - left) / 2;

            // If the middle element is the target value, return its index
            if (arr[mid] == target) {
                return mid;
            }

            // If the target value is less than the middle element, search the left half of the array
            else if (target < arr[mid]) {
                right = mid - 1;
            }

            // If the target value is greater than the middle element, search the right half of the array
            else {
                left = mid + 1;
            }
        }

        // The target value was not found
        return -1;
    }

    /*
     * The time complexity of binary search is O(log n), where n is the size of the input array.
     * This makes binary search an efficient algorithm for searching large sorted arrays.
     * However, it is important to note that binary search only works on sorted arrays,
     * and its worst-case time complexity is O(n) if the array is not sorted.
     */
}
