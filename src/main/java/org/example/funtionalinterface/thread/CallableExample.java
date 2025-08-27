package org.example.funtionalinterface.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> "Callable Result";
        Future<String> future = executor.submit(task);

        try {
            System.out.println("Callable Result== " + future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }

}
