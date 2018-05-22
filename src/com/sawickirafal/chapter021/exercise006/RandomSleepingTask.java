package com.sawickirafal.chapter021.exercise006;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomSleepingTask implements Runnable {
    private Random randomGenerator = new Random();

    @Override
    public void run() {
        try {
            int sleepingTime = randomGenerator.nextInt(11) + 1;
            TimeUnit.SECONDS.sleep(sleepingTime);
            System.out.println("Sleeping time was: " + sleepingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
