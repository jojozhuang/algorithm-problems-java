package johnny.leetcode.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SolutionA1117Example {
    public static void main(String[] args) throws InterruptedException {
        Map validResult = new HashMap();
        validResult.put("HhO", true);
        validResult.put("HOh", true);
        validResult.put("OHh", true);
        validResult.put("OhH", true);
        validResult.put("hOH", true);
        validResult.put("hHO", true);

        int count = 100;
        SolutionA1117 h2o = new SolutionA1117();

        StringBuffer sb = new StringBuffer();

        Runnable releaseHydrogen1 = () -> sb.append("H");
        Runnable releaseHydrogen2 = () -> sb.append("h");
        Runnable releaseOxygen = () -> sb.append("O");

        HydrogenGenerator h1 = new HydrogenGenerator(count, h2o, releaseHydrogen1);
        HydrogenGenerator h2 = new HydrogenGenerator(count, h2o, releaseHydrogen2);
        OxygenGenerator o = new OxygenGenerator(count, h2o, releaseOxygen);

        h1.start();
        o.start();
        Thread.sleep(1000);
        h2.start();

        h1.join();
        h2.join();
        o.join();

        System.out.println(sb.toString());

        for (int i = 0; i < (count - 1) * 3; i += 3) {
            String s = sb.substring(i, i + 3);

            if (validResult.get(s) == null) {
                System.out.println("expect (H && h && O) but got " + s);
            }
        }
    }

    static class HydrogenGenerator extends Thread {
        int n;
        SolutionA1117 h2o;
        Runnable releaseHydrogen;
        Random rand = new Random(System.currentTimeMillis());


        public HydrogenGenerator(int n, SolutionA1117 h2o, Runnable releaseHydrogen) {
            this.n = n;
            this.h2o = h2o;
            this.releaseHydrogen = releaseHydrogen;
        }


        @Override
        public void run() {
            for (; n >= 0; n--) {

                try {
                    Thread.sleep(rand.nextInt(100));
                    h2o.hydrogen(releaseHydrogen);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    static class OxygenGenerator extends Thread {
        int n;
        SolutionA1117 h2o;
        Runnable releaseOxygen;
        Random rand = new Random(System.currentTimeMillis());

        public OxygenGenerator(int n, SolutionA1117 h2o, Runnable releaseOxygen) {
            this.n = n;
            this.h2o = h2o;
            this.releaseOxygen = releaseOxygen;
        }

        @Override
        public void run() {
            for (; n >= 0; n--) {
                try {
                    Thread.sleep(rand.nextInt(100));
                    h2o.oxygen(releaseOxygen);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
