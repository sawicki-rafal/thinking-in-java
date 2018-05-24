package com.sawickirafal.chapter021.exercise011;

public class NormalGenerator{
    private int oddNumber = -1;
    private int evenNumber = -2;

    public int getNextOddNumber(){
        oddNumber++;
        Thread.yield();
        oddNumber++;
        return oddNumber;
    }

    public int getNextEvenNumber(){
        evenNumber++;
        Thread.yield();
        evenNumber++;
        return evenNumber;
    }

}
