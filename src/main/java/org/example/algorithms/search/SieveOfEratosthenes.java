package org.example.algorithms.search;

import java.util.Arrays;

public class SieveOfEratosthenes {

    /**
     * Finds all prime numbers up to the given limit using the Sieve of Eratosthenes algorithm.
     * @param limit the upper bound of the prime numbers to find
     * @return an array of boolean values, where the ith value is true if i is prime and false otherwise
     */
    public static boolean[] sieveOfEratosthenes(int limit) {
        // Create an array of boolean values initialized to true
        boolean[] primes = new boolean[limit + 1];
        Arrays.fill(primes, true);

        // 0 and 1 are not prime, so set their values to false
        primes[0] = false;
        primes[1] = false;

        // Iterate over all integers from 2 to the square root of the limit
        for (int i = 2; i * i <= limit; i++) {
            // If i is prime, set all its multiples to false
            if (primes[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    primes[j] = false;
                }
            }
        }

        return primes;
    }

    /*
     *The Sieve of Eratosthenes is an efficient algorithm for finding all prime numbers up to a given limit.
     * The algorithm works by iteratively marking the multiples of each prime number as composite,
     * until only prime numbers remain.
     * In this implementation, we first create an array of boolean values initialized to true,
     * where each value corresponds to an integer up to the limit. We then iterate over all integers from 2 to
     * the square root of the limit. For each prime number i, we mark all its multiples as composite by setting their
     * corresponding array values to false.
     * After the algorithm finishes, the array of boolean values contains true values for all prime numbers up to the limit,
     * and false values for all composite numbers.
     * The time complexity of the Sieve of Eratosthenes algorithm is O(n log log n), where n is the limit.
     * This makes it an efficient algorithm for finding prime numbers up to a large limit.
     */
}
