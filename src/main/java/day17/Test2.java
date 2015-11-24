package day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class Test2 {
    int count = 0;

    void increment() {
        count = count + 1;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(12);
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
        executor.shutdown();
    }
}
