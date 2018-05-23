package com.sawickirafal.chapter021.exercise009;

import java.util.Random;
import java.util.concurrent.ThreadFactory;

public class PrioritizedThreadFactory implements ThreadFactory {
    private Random randomGenerator = new Random();

    @Override
    public Thread newThread(Runnable runnable) {
        Thread t = new Thread(runnable);
        int priority = getRandomPriority();
        t.setPriority(priority);
        return t;
    }

    private int getRandomPriority() {
        int randomNumber = randomGenerator.nextInt(3);
        switch (randomNumber) {
            case 0:
                return Thread.MIN_PRIORITY;
            case 1:
                return Thread.MAX_PRIORITY;
            default:
                return Thread.MIN_PRIORITY;
        }
    }
}
