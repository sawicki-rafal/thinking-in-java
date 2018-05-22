package com.sawickirafal.chapter021.exercise002;

public class Main {
    public static void main(String[] args) {

        FibonacciTask taskOne = new FibonacciTask(5);
        FibonacciTask taskTwo = new FibonacciTask(21);
        FibonacciTask taskThree = new FibonacciTask(34);

        Thread one = new Thread(taskOne);
        Thread two = new Thread(taskTwo);
        Thread three = new Thread(taskThree);

        one.start();
        two.start();
        three.start();
    }
}
