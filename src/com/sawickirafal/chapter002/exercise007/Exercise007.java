package com.sawickirafal.chapter002.exercise007;

public class Exercise007 {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        System.out.println("st1: " + st1.i);
        System.out.println("st2: " + st2.i);
        System.out.println("StaticTest: " + StaticTest.i);

        Incrementable sf = new Incrementable();
        sf.increment();

        System.out.println("st1: " + st1.i);
        System.out.println("st2: " + st2.i);
        System.out.println("StaticTest: " + StaticTest.i);

        Incrementable.increment();

        System.out.println("st1: " + st1.i);
        System.out.println("st2: " + st2.i);
        System.out.println("StaticTest: " + StaticTest.i);

    }
}
