package chapter.two;

class ClassWithStatic {
    static int i = 1;
}

public class Exercise008 {
    public static void main(String[] args) {
        ClassWithStatic cl1 = new ClassWithStatic();
        cl1.i++;

        ClassWithStatic cl2 = new ClassWithStatic();

        System.out.println(cl2.i);
    }
}
