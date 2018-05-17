package com.sawickirafal.chapter021.exercise001;

public class ThinkingRunnable implements Runnable {
    private static int instanceCounter = 0;
    private final int id = instanceCounter++;

    @Override
    public void run() {
        System.out.println("#" + id + ": START");
        int i = 0;
        while (i < 3) {
            System.out.println("It is me: " + id);
            i++;
        }
        System.out.println("#" + id + ": END");
    }
}
