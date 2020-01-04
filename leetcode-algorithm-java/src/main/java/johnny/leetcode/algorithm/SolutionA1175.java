package johnny.leetcode.algorithm;

/**
 * 1175. Prime Arrangements
 * Return the number of permutations of 1 to n so that prime numbers are at prime indices (1-indexed.)
 * <p>
 * (Recall that an integer is prime if and only if it is greater than 1, and cannot be written as a product of two positive integers both smaller than it.)
 * <p>
 * Since the answer may be large, return the answer modulo 10^9 + 7.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 5
 * Output: 12
 * Explanation: For example [1,2,5,4,3] is a valid permutation, but [5,2,3,4,1] is not because the prime number 5 is at index 1.
 * Example 2:
 * <p>
 * Input: n = 100
 * Output: 682289015
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 100
 *
 * @author Johnny
 */
public class SolutionA1175 {
    public int numPrimeArrangements(int n) {
        int count = countPrimes(n);
        long ans = 1;
        for (int i = 1; i <= count; i++) {
            ans = ans % 1000000007;
            ans = ans * i;
        }
        for (int i = 1; i <= n - count; i++) {
            ans = ans % 1000000007;
            ans = ans * i;
        }
        return (int) (ans % 1000000007);
    }

    private int countPrimes(int n) {
        boolean[] notPrime = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j <= n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        return count;
    }
}