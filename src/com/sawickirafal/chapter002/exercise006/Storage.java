package com.sawickirafal.chapter002.exercise006;

public class Storage {
    static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum";
        int size = storage(text);
        System.out.println(size);
    }
}
