package johnny.algorithm.advanced;

import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MultiThreading {

    public static void main(String[] args) {
        final int size = 1000000;
        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = Math.random(); // generate random numbers
        }
        Counter counter = new Counter(numbers, 0, numbers.length, new Filter() {
            public boolean accept(double x) {
                return x > 0.5;
            }
        });
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(counter);
        System.out.println(counter.join()); // output: 500305
    }

    interface Filter {
        boolean accept(double t);
    }

    static class Counter extends RecursiveTask<Integer> {
        public static final int THRESHOLD = 1000;
        private double[] values;
        private int from;
        private int to;
        private Filter filter;

        public Counter(double[] numbers, int i, int length, Filter filter) {
            this.values = numbers;
            this.from = i;
            this.to = length;
            this.filter = filter;
        }

        @Override
        protected Integer compute() {
            if (to - from < THRESHOLD) {
                int count = 0;
                for (int i = from; i < to; i++) {
                    if (filter.accept(values[i])) count++;
                }
                return count;
            } else {
                int mid = (from + to) / 2;
                Counter first = new Counter(values, from, mid, filter);
                Counter second = new Counter(values, mid, to, filter);
                invokeAll(first, second);
                return first.join() + second.join();
            }
        }
    }
}

