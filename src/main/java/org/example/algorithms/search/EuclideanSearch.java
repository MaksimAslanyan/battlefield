package org.example.algorithms.search;

public class EuclideanSearch {

    /**
     * Computes the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     * @param a the first integer
     * @param b the second integer
     * @return the GCD of a and b
     */
    public static int gcd(int a, int b) {
        // Base case: if b is 0, the GCD is a
        if (b == 0) {
            return a;
        }

        // Recursive case: compute the GCD of b and the remainder of a divided by b
        return gcd(b, a % b);
    }

    /**
     * Computes the least common multiple (LCM) of two integers using the GCD.
     * @param a the first integer
     * @param b the second integer
     * @return the LCM of a and b
     */
    public static int lcm(int a, int b) {
        // Compute the GCD of a and b
        int gcd = gcd(a, b);

        // Compute the LCM using the formula LCM(a, b) = (a * b) / GCD(a, b)
        return (a / gcd) * b;
    }
}
