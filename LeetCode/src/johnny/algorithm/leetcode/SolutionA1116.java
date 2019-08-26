package johnny.algorithm.leetcode;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * 1116. Print Zero Even Odd
Suppose you are given the following code:

class ZeroEvenOdd {
  public ZeroEvenOdd(int n) { ... }      // constructor
  public void zero(printNumber) { ... }  // only output 0's
  public void even(printNumber) { ... }  // only output even numbers
  public void odd(printNumber) { ... }   // only output odd numbers
}
The same instance of ZeroEvenOdd will be passed to three different threads:

Thread A will call zero() which should only output 0's.
Thread B will call even() which should only ouput even numbers.
Thread C will call odd() which should only output odd numbers.
Each of the threads is given a printNumber method to output an integer. Modify the given program to output the series 010203040506... where the length of the series must be 2n.

 

Example 1:

Input: n = 2
Output: "0102"
Explanation: There are three threads being fired asynchronously. One of them calls zero(), the other calls even(), and the last one calls odd(). "0102" is the correct output.
Example 2:

Input: n = 5
Output: "0102030405"

 * @author Johnny
 */
public class SolutionA1116 {
    private int n;
    Semaphore semp1, semp2, semp3;
    public SolutionA1116(int n) {
        this.n = n;
        semp1 = new Semaphore(1); // zero
        semp2 = new Semaphore(0); // even
        semp3 = new Semaphore(0); // odd
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            semp1.acquire();
            printNumber.accept(0);
            if (i % 2 == 1) {
                semp2.release();
            } else {
                semp3.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i+=2) {
            semp2.acquire();
            printNumber.accept(i);
            semp1.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i+=2) {
            semp3.acquire();
            printNumber.accept(i);
            semp1.release();
        }
    }
}
