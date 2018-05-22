package com.sawickirafal.chapter021.exercise005;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        CallableFibonacciTask taskOne = new CallableFibonacciTask(5);
        CallableFibonacciTask taskTwo = new CallableFibonacciTask(21);
        CallableFibonacciTask taskThree = new CallableFibonacciTask(34);

        ArrayList<Future<Integer>> results = new ArrayList<>();

        results.add(executor.submit(taskOne));
        results.add(executor.submit(taskTwo));
        results.add(executor.submit(taskThree));

        for(Future<Integer> result:results){
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                executor.shutdown();
            }
        }
    }
}
