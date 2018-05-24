package com.sawickirafal.chapter021.exercise005;

import generics.Fibonacci;

import java.util.concurrent.Callable;

public class CallableFibonacciTask implements Callable<Integer> {
    private Fibonacci fibonacciGenerator = new Fibonacci();
    private int upperLimit;

    public CallableFibonacciTask(int upperLimit) {
        this.upperLimit = upperLimit;
    }


    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i < upperLimit; i++) {
            sum += fibonacciGenerator.next();
        }
        return sum;
    }
}
