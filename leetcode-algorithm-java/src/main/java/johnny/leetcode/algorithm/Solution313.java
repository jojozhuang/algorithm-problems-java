package johnny.leetcode.algorithm;

/**
 * Super Ugly Number.
 * Write a program to find the nth super ugly number.
 * <p>
 * Super ugly numbers are positive numbers whose all prime factors are in the
 * given prime list primes of size k. For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32]
 * is the sequence of the first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4.
 * <p>
 * Note:
 * (1) 1 is a super ugly number for any given primes.
 * (2) The given numbers in primes are in ascending order.
 * (3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.
 *
 * @author Johnny
 */
public class Solution313 {
    //http://www.programcreek.com/2014/05/leetcode-super-ugly-number-java/
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0) {
            return 0;
        }
        int[] times = new int[primes.length];
        int[] result = new int[n];
        result[0] = 1; // first is 1

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * result[times[j]]);
            }

            result[i] = min;

            for (int j = 0; j < times.length; j++) {
                if (result[times[j]] * primes[j] == min) {
                    times[j]++;
                }
            }
        }

        return result[n - 1];
    }

    //dp
    public int nthSuperUglyNumber3(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0) {
            return 0;
        }

        int[] res = new int[n];
        res[0] = 1;
        int[] index = new int[primes.length];
        int count = 1;
        while (count < n) {
            int min = Integer.MAX_VALUE;
            int pos = -1;
            for (int i = 0; i < primes.length; i++) {
                int next = res[index[i]] * primes[i];
                if (next < min) {
                    min = next;
                    pos = i;
                }
            }
            index[pos]++;
            if (res[count - 1] != min) {
                res[count] = min;
                count++;
            }
        }

        return res[n - 1];
    }

    // Similar logic with Ugly Number 2
    public int nthSuperUglyNumber2(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0) {
            return 0;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        int[] index = new int[primes.length];
        int count = 1;

        while (count < n) {
            arr[count] = nextUgly(arr, primes, index);
            for (int i = 0; i < index.length; i++) {
                if (arr[count] == arr[index[i]] * primes[i]) {
                    index[i] = index[i] + 1;
                }
            }
            count++;
        }

        return arr[n - 1];
    }

    private int nextUgly(int[] ugly, int[] primes, int[] index) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < index.length; i++) {
            min = Math.min(ugly[index[i]] * primes[i], min);
        }
        return min;
    }
}
