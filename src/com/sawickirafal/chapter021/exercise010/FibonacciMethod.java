package com.sawickirafal.chapter021.exercise010;

import generics.Fibonacci;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciMethod {
    private Callable<Integer> callable;
    private ExecutorService executorService = Executors.newCachedThreadPool();
    private Fibonacci fibonacciGenerator = new Fibonacci();

    public Future<Integer> runTask(int upperLimit) {
        callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i < upperLimit; i++) {
                    sum += fibonacciGenerator.next();
                }
                return sum;
            }
        };
        return executorService.submit(callable);
    }

    public void shutdown(){
        executorService.shutdown();
    }
}
