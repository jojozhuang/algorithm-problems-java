package johnny.leetcode.concurrency.test;

import johnny.leetcode.concurrency.SolutionA1114;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SolutionA1114Test {

    @Test
    public void testPrintInOrder() {
        StringBuffer sb = new StringBuffer();
        Runnable print1 = () -> {System.out.print("first"); sb.append("first");};
        Runnable print2 = () -> {System.out.print("second"); sb.append("second");};
        Runnable print3 = () -> {System.out.print("third"); sb.append("third");};

        SolutionA1114 solution = new SolutionA1114();
        Worker1 worker1 = new Worker1(solution, print1);
        Worker2 worker2 = new Worker2(solution, print2);
        Worker3 worker3 = new Worker3(solution, print3);

        worker3.start();
        worker2.start();
        worker1.start();

        try {
            worker1.join();
            worker2.join();
            worker3.join();
        } catch (InterruptedException ite) {

        }

        assertEquals("firstsecondthird", sb.toString());
    }

    static class Worker1 extends Thread {
        SolutionA1114 solution;
        Runnable printer;
        Random rand = new Random(System.currentTimeMillis());
        public Worker1(SolutionA1114 solution, Runnable printer) {
            this.solution = solution;
            this.printer = printer;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(100));
                solution.first(printer); // call first() method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker2 extends Thread {
        SolutionA1114 solution;
        Runnable printer;
        Random rand = new Random(System.currentTimeMillis());
        public Worker2(SolutionA1114 solution, Runnable printer) {
            this.solution = solution;
            this.printer = printer;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(100));
                solution.second(printer); // call second() method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker3 extends Thread {
        SolutionA1114 solution;
        Runnable printer;
        Random rand = new Random(System.currentTimeMillis());
        public Worker3(SolutionA1114 solution, Runnable printer) {
            this.solution = solution;
            this.printer = printer;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(100));
                solution.third(printer); // call second() method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
