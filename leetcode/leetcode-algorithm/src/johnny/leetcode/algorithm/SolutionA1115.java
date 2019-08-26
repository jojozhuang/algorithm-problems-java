package johnny.leetcode.algorithm;

import java.util.concurrent.Semaphore;

/**
 * 1115. Print FooBar Alternately
Suppose you are given the following code:

class FooBar {
  public void foo() {
    for (int i = 0; i < n; i++) {
      print("foo");
    }
  }

  public void bar() {
    for (int i = 0; i < n; i++) {
      print("bar");
    }
  }
}
The same instance of FooBar will be passed to two different threads. Thread A will call foo() while thread B will call bar(). Modify the given program to output "foobar" n times.

 

Example 1:

Input: n = 1
Output: "foobar"
Explanation: There are two threads being fired asynchronously. One of them calls foo(), while the other calls bar(). "foobar" is being output 1 time.
Example 2:

Input: n = 2
Output: "foobarfoobar"
Explanation: "foobar" is being output 2 times.

 * @author Johnny
 */
public class SolutionA1115 {
    private int n;
    Semaphore semp1, semp2;
    public SolutionA1115(int n) {
        this.n = n;
        semp1 = new Semaphore(1);
        semp2 = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            semp1.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semp2.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            semp2.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semp1.release();
        }
    }
}
