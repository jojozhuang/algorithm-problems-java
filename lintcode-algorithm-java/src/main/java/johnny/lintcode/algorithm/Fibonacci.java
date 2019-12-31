package johnny.lintcode.algorithm;

/**
 * Fibonacci.
 * Find the Nth number in Fibonacci sequence.
 * 
 * A Fibonacci sequence is defined as follow:
 * 
 * The first two numbers are 0 and 1.
 * The i th number is the sum of i-1 th number and i-2 th number.
 * The first ten numbers in Fibonacci sequence is:
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * 
 * Example
 * Given 1, return 0
 * 
 * Given 2, return 1
 * 
 * Given 10, return 34
 * 
 * Note
 * The Nth fibonacci number won't exceed the max value of signed 32-bit integer in the test cases.
 * 
 * @author Johnny
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        
        int[] ret = new int[n];
        ret[0] = 0;
        ret[1] = 1;
        for (int i = 2; i < n; i++)  {
            ret[i] = ret[i - 1] + ret[i - 2];
        }
        
        return ret[n - 1];
    }
}
