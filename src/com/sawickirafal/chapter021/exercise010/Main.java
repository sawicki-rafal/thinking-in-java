package com.sawickirafal.chapter021.exercise010;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        FibonacciMethod fibonacciMethod = new FibonacciMethod();
        ArrayList<Future<Integer>> results = new ArrayList<>();

        results.add(fibonacciMethod.runTask(5));
        results.add(fibonacciMethod.runTask(10));
        results.add(fibonacciMethod.runTask(17));

        for(Future<Integer> result:results){
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                fibonacciMethod.shutdown();
            }
        }
    }
}
