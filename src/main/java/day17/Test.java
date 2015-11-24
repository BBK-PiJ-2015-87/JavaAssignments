package day17;

import java.util.Objects;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class Test {
    public int count = 1;
    private final Object lock = new Object();

//    public void increment() {
//        synchronized (lock) {
//            count++;
//        }
//    }
//
//    public void decrement() {
//        synchronized (lock) {
//            count--;
//        }
//    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public static void main(String[] args) throws InterruptedException {

        final Test test = new Test();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                test.increment();
                System.out.println("thread 1");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                test.decrement();
                System.out.println("thread 2");
            }
        });

        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(test.count);
    }
}


