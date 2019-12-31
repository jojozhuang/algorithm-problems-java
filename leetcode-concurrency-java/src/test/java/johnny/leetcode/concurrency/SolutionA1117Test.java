package johnny.leetcode.concurrency;

import johnny.leetcode.concurrency.SolutionA1117;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SolutionA1117Test {

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
        Runnable print1 = () -> {System.out.print("H");sb.append("H");};
        Runnable print3 = () -> {System.out.print("O");sb.append("O");};

        SolutionA1117 solution = new SolutionA1117();
        Hydrogen h1 = new Hydrogen(n, solution, print1);
        Hydrogen h2 = new Hydrogen(n, solution, print1);
        Oxygen o = new  Oxygen(n, solution, print3);

        h1.start();
        h2.start();
        o.start();

        try {
            h1.join();
            h2.join();
            o.join();
        } catch (InterruptedException ite) {

        }

        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < n; i++) {
            expected.append("HHO");
        }
        assertEquals(expected.toString(), sb.toString());
    }

    static class Hydrogen extends Thread {
        int n;
        SolutionA1117 solution;
        Runnable printer;
        Random rand = new Random(System.currentTimeMillis());
        public Hydrogen(int n, SolutionA1117 solution, Runnable printer) {
            this.n = n;
            this.solution = solution;
            this.printer = printer;
        }
        @Override
        public void run() {
            try {
                for (int i = 0; i < n; i++) {
                    Thread.sleep(rand.nextInt(100));
                    solution.hydrogen(printer); // call hydrogen() method
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Oxygen extends Thread {
        int n;
        SolutionA1117 solution;
        Runnable printer;
        Random rand = new Random(System.currentTimeMillis());
        public  Oxygen(int n, SolutionA1117 solution, Runnable printer) {
            this.n = n;
            this.solution = solution;
            this.printer = printer;
        }
        @Override
        public void run() {
            try {
                for (int i = 0; i < n; i++) {
                    Thread.sleep(rand.nextInt(100));
                    solution.oxygen(printer); // call oxygen() method
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
