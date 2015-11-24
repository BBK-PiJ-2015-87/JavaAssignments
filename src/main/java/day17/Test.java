package day17;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class Test {
    public int count = 1;

    public void increment() {
        count--;
    }

    public void decrement() {
        count--;
    }

    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            final Test test = new Test();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        test.increment();
                    }
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        test.decrement();
                    }
                }
            });

            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        test.increment();
                    }
                }
            });

            Thread t4 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        test.decrement();
                    }
                }
            });

            t1.start();
            t2.start();
            t3.start();
            t4.start();

            System.out.println(test.count);
        }
    }
}


