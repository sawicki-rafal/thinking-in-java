package chapter.two;

public class Exercise6 {
    static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum";
        int size = storage(text);
        System.out.println(size);
    }
}
