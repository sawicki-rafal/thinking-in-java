package com.sawickirafal.chapter021.exercise011;

public class NormalTask implements Runnable {
    private static NormalGenerator normalGenerator = new NormalGenerator();
    @Override
    public void run() {
        boolean isEnd = false;
        String name = Thread.currentThread().getName();
        int x, y = 0;
        while (!isEnd) {
            if ((x = normalGenerator.getNextEvenNumber()) % 2 != 0) {
                System.out.println("NT: " + x + " is not even in " + name);
                isEnd = true;
            } else if ((y = normalGenerator.getNextOddNumber()) % 2 == 0) {
                System.out.println("NT: " + y + " is not odd in " + name);
                isEnd = true;
            }
            if (x == Integer.MAX_VALUE/1000 || y == Integer.MAX_VALUE/1000) {
                System.out.println("NT: Upper limit reached");
                isEnd = true;
            }
        }
    }
}
