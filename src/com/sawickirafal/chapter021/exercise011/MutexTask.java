package com.sawickirafal.chapter021.exercise011;

public class MutexTask implements Runnable {
    private static GeneratorWithMutex generatorWithMutex = new GeneratorWithMutex();
    @Override
    public void run() {
        boolean isEnd = false;
        String name = Thread.currentThread().getName();
        int x=0, y = 0;
        while (!isEnd) {

            if ((x = generatorWithMutex.getNextEvenNumber()) % 2 != 0) {
                System.out.println("MT: " + x + " is not even in " + name);
                isEnd = true;
            } else if ((y = generatorWithMutex.getNextOddNumber()) % 2 == 0) {
                System.out.println("MT: " + y + " is not odd in " + name);
                isEnd = true;
            }
            if (x >= Integer.MAX_VALUE/1000 || y >= Integer.MAX_VALUE/1000) {
                System.out.println("MT: Upper limit reached");
                isEnd = true;
            }
        }
    }
}
