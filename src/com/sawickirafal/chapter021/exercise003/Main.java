package com.sawickirafal.chapter021.exercise003;

import com.sawickirafal.chapter021.exercise001.ThinkingRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int NUMBER_OF_TASKS = 5;

    public static void main(String[] args) {
        ExecutorService cachedExecutor = Executors.newCachedThreadPool();
        ExecutorService fixedExecutor = Executors.newFixedThreadPool(NUMBER_OF_TASKS);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        //change this line to see efects
        ExecutorService executor = singleThreadExecutor;

        for (int i = 0; i < NUMBER_OF_TASKS; i++) {
            executor.execute(new ThinkingRunnable());
        }
    }
}
