package com.sawickirafal.chapter021.exercise011;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executorService.execute(new MutexTask());
        }
        for (int i = 0; i < 5; i++) {
            executorService.execute(new NormalTask());
        }

        executorService.shutdown();
    }
}
