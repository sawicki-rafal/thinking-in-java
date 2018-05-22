package com.sawickirafal.chapter021.exercise004;

import com.sawickirafal.chapter021.exercise002.FibonacciTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int NUMBER_OF_TASKS = 5;

    public static void main(String[] args) {
        FibonacciTask taskOne = new FibonacciTask(5);
        FibonacciTask taskTwo = new FibonacciTask(21);
        FibonacciTask taskThree = new FibonacciTask(34);

        ExecutorService cachedExecutor = Executors.newCachedThreadPool();
        ExecutorService fixedExecutor = Executors.newFixedThreadPool(NUMBER_OF_TASKS);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        //change this line to see effects
        ExecutorService executor = singleThreadExecutor;

        executor.execute(taskOne);
        executor.execute(taskTwo);
        executor.execute(taskThree);
    }
}