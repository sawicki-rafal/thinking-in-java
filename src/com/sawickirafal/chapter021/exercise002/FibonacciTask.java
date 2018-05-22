package com.sawickirafal.chapter021.exercise002;

import generics.Fibonacci;

public class FibonacciTask implements Runnable {
    private static int instanceCounter = 0;
    private final int id = instanceCounter++;
    private Fibonacci fibonacciGenerator = new Fibonacci();
    private int upperLimit;

    public FibonacciTask(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public void run() {
        System.out.println("#" + id + ": START");
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < upperLimit; i++) {
            System.out.println("#" + id + ": RUNNING");
            sequence.append(fibonacciGenerator.next());
            sequence.append(" ");
        }
        System.out.println("#" + id + ": END [" + sequence.toString() + "]");
    }
}
