package johnny.leetcode.algorithm;

/**
 * 866. Prime Palindrome
 * <p>
 * Find the smallest prime palindrome greater than or equal to N.
 * <p>
 * Recall that a number is prime if it's only divisors are 1 and itself, and it is greater than 1.
 * <p>
 * For example, 2,3,5,7,11 and 13 are primes.
 * <p>
 * Recall that a number is a palindrome if it reads the same from left to right as it does from right to left.
 * <p>
 * For example, 12321 is a palindrome.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 6
 * Output: 7
 * Example 2:
 * <p>
 * Input: 8
 * Output: 11
 * Example 3:
 * <p>
 * Input: 13
 * Output: 101
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 10^8
 * The answer is guaranteed to exist and be less than 2 * 10^8.
 *
 * @author Johnny
 */
public class Solution866 {
    public int primePalindrome(int N) {
        for (int L = 1; L <= 5; ++L) {
            //Check for odd-length palindromes
            for (int root = (int) Math.pow(10, L - 1); root < (int) Math.pow(10, L); ++root) {
                StringBuilder sb = new StringBuilder(Integer.toString(root));
                for (int k = L - 2; k >= 0; --k)
                    sb.append(sb.charAt(k));
                int x = Integer.valueOf(sb.toString());
                if (x >= N && isPrime(x))
                    return x;
                //If we didn't check for even-length palindromes:
                //return N <= 11 ? min(x, 11) : x
            }

            //Check for even-length palindromes
            for (int root = (int) Math.pow(10, L - 1); root < (int) Math.pow(10, L); ++root) {
                StringBuilder sb = new StringBuilder(Integer.toString(root));
                for (int k = L - 1; k >= 0; --k)
                    sb.append(sb.charAt(k));
                int x = Integer.valueOf(sb.toString());
                if (x >= N && isPrime(x))
                    return x;
            }
        }

        throw null;
    }

    public boolean isPrime(int N) {
        if (N < 2) return false;
        int R = (int) Math.sqrt(N);
        for (int d = 2; d <= R; ++d)
            if (N % d == 0) return false;
        return true;
    }
}
