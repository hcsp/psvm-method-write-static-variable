package com.github.hcsp;

public class Main {
    public static String message = "Hello";

    public static void main(String[] args) {
        System.out.println(message);
        updateMessage();
        System.out.println(message);
    }

    public static void updateMessage() {
        Main.message = "Hi";
    }
}
