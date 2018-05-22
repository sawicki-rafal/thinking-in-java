package com.sawickirafal.chapter021.exercise006;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        RandomSleepingTask taskOne = new RandomSleepingTask();
        RandomSleepingTask taskTwo = new RandomSleepingTask();
        RandomSleepingTask taskThree = new RandomSleepingTask();

        executor.execute(taskOne);
        executor.execute(taskTwo);
        executor.execute(taskThree);

        executor.shutdown();
    }
}
