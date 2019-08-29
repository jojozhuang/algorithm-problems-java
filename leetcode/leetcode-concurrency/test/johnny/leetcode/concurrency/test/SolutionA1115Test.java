package johnny.leetcode.concurrency.test;

import johnny.leetcode.concurrency.SolutionA1115;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SolutionA1115Test {

    @Test
    public void testPrintAlternately1() {
        testPrintAlternately(1);
    }

    @Test
    public void testPrintAlternately2() {
        testPrintAlternately(2);
    }

    @Test
    public void testPrintAlternately5() {
        testPrintAlternately(5);
    }

    @Test
    public void testPrintAlternately10() {
        testPrintAlternately(10);
    }

    private void testPrintAlternately(int n) {
        StringBuffer sb = new StringBuffer();
        Runnable print1 = () -> {System.out.print("foo"); sb.append("foo");};
        Runnable print2 = () -> {System.out.print("bar"); sb.append("bar");};

        SolutionA1115 solution = new SolutionA1115(n);
        Worker1 worker1 = new Worker1(solution, print1);
        Worker2 worker2 = new Worker2(solution, print2);

        worker2.start();
        worker1.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException ite) {

        }

        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < n; i++) {
            expected.append("foobar");
        }
        assertEquals(expected.toString(), sb.toString());
    }

    static class Worker1 extends Thread {
        SolutionA1115 solution;
        Runnable printer;
        Random rand = new Random(System.currentTimeMillis());
        public Worker1(SolutionA1115 solution, Runnable printer) {
            this.solution = solution;
            this.printer = printer;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(100));
                solution.foo(printer); // call foo() method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker2 extends Thread {
        SolutionA1115 solution;
        Runnable printer;
        Random rand = new Random(System.currentTimeMillis());
        public Worker2(SolutionA1115 solution, Runnable printer) {
            this.solution = solution;
            this.printer = printer;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(100));
                solution.bar(printer); // call second() method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
