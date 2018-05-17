package com.sawickirafal.chapter021.exercise001;

public class Main {
    public static void main(String[] args) {

        ThinkingRunnable taskOne = new ThinkingRunnable();
        ThinkingRunnable taskTwo = new ThinkingRunnable();
        ThinkingRunnable taskThree = new ThinkingRunnable();

        Thread one = new Thread(taskOne);
        Thread two = new Thread(taskTwo);
        Thread three = new Thread(taskThree);

        one.start();
        two.start();
        three.start();
    }
}
