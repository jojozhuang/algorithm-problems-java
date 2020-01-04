package johnny.leetcode.algorithm;

import java.util.ArrayList;

/**
 * Count Primes.
 * <p>
 * Description:
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Hint:
 * <p>
 * Let's start with a isPrime function. To determine if a number is prime, we
 * need to check if it is not divisible by any number less than n. The runtime
 * complexity of isPrime function would be O(n) and hence counting the total
 * prime numbers up to n would be O(n2). Could we do better?
 *
 * @author Johnny
 */
public class Solution204 {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }

        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!notPrime[i]) {
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!notPrime[i]) {
                ans++;
            }
        }

        return ans - 1;
    }

    public int countPrimes9(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        return count;
    }

    public int countPrimes4(int n) {
        if (n < 3)
            return 0;

        boolean[] f = new boolean[n];
        //Arrays.fill(f, true); boolean[] are initialed as false by default
        int count = n / 2;
        for (int i = 3; i * i < n; i += 2) {
            if (f[i])
                continue;

            for (int j = i * i; j < n; j += 2 * i) {
                if (!f[j]) {
                    --count;
                    f[j] = true;
                }
            }
        }
        return count;
    }

    public int countPrimes3(int n) {
        //n = n - 1;

        ArrayList<Integer> primes = new ArrayList<Integer>();

        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;

        primes.add(2);
        primes.add(3);

        for (int i = 4; i <= n; i++) {
            boolean isPrime = true;
            for (int p : primes) {
                if ((i % p) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }

        return primes.size();
    }

    public int countPrimes6(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
