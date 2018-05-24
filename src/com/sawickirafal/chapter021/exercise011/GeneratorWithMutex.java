package com.sawickirafal.chapter021.exercise011;

public class GeneratorWithMutex{
    private int oddNumber = -1;
    private int evenNumber = -2;

    public synchronized int getNextOddNumber(){
        oddNumber++;
        Thread.yield();
        oddNumber++;
        return oddNumber;
    }

    public synchronized int getNextEvenNumber(){
        evenNumber++;
        Thread.yield();
        evenNumber++;
        return evenNumber;
    }
}
