package johnny.leetcode.concurrency.test;

import johnny.leetcode.concurrency.SolutionA1116;
import org.junit.Test;

import java.util.Random;
import java.util.function.IntConsumer;

import static org.junit.Assert.assertEquals;

public class SolutionA1116Test {

    @Test
    public void testPrintZeroEvenOdd1() {
        testPrintZeroEvenOdd(1);
    }

    @Test
    public void testPrintZeroEvenOdd2() {
        testPrintZeroEvenOdd(2);
    }

    @Test
    public void testPrintZeroEvenOdd5() {
        testPrintZeroEvenOdd(5);
    }

    @Test
    public void testPrintZeroEvenOdd10() {
        testPrintZeroEvenOdd(10);
    }

    private void testPrintZeroEvenOdd(int n) {
        StringBuffer sb = new StringBuffer();
        IntConsumer intConsumer = (i) -> {System.out.print(i); sb.append(i);};

        SolutionA1116 solution = new SolutionA1116(n);
        Worker1 worker1 = new Worker1(solution, intConsumer);
        Worker2 worker2 = new Worker2(solution, intConsumer);
        Worker3 worker3 = new Worker3(solution, intConsumer);

        worker3.start();
        worker2.start();
        worker1.start();

        try {
            worker1.join();
            worker2.join();
            worker3.join();
        } catch (InterruptedException ite) {

        }

        StringBuilder expected = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            expected.append("0");
            expected.append(i);
        }
        assertEquals(expected.toString(), sb.toString());
    }

    static class Worker1 extends Thread {
        SolutionA1116 solution;
        IntConsumer intConsumer;
        Random rand = new Random(System.currentTimeMillis());
        public Worker1(SolutionA1116 solution, IntConsumer intConsumer) {
            this.solution = solution;
            this.intConsumer = intConsumer;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(100));
                solution.zero(intConsumer); // call zero() method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker2 extends Thread {
        SolutionA1116 solution;
        IntConsumer intConsumer;
        Random rand = new Random(System.currentTimeMillis());
        public Worker2(SolutionA1116 solution, IntConsumer intConsumer) {
            this.solution = solution;
            this.intConsumer = intConsumer;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(100));
                solution.even(intConsumer); // call even() method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker3 extends Thread {
        SolutionA1116 solution;
        IntConsumer intConsumer;
        Random rand = new Random(System.currentTimeMillis());
        public Worker3(SolutionA1116 solution, IntConsumer intConsumer) {
            this.solution = solution;
            this.intConsumer = intConsumer;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(100));
                solution.odd(intConsumer); // call odd() method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
