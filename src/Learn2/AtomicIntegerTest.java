package Learn2;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main (String[] args) {
       MyThread myThread1 = new MyThread();
       MyThread myThread2 = new MyThread();
       MyThread myThread3 = new MyThread();
       MyThread myThread4 = new MyThread();

       synchronized (atomicInteger) {
           myThread1.start();
           myThread2.start();
           myThread3.start();
           myThread4.start();
       }
       System.out.println(atomicInteger);
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }
}
