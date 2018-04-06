package chapter.two;

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

public class Exercise7 {
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
