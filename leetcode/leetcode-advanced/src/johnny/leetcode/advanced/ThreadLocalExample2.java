package johnny.leetcode.advanced;

import java.util.Random;

public class ThreadLocalExample2 {
    public static class MyRunnable implements Runnable {

        private Integer num = 0;

        @Override
        public void run() {
            Random random = new Random();
            num = random.nextInt(100);
    
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
    
            System.out.println(num);
        }
    }


    public static void main(String[] args) {
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        try
        {
            thread1.join(); //wait for thread 1 to terminate
            thread2.join(); //wait for thread 2 to terminate
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }

}
