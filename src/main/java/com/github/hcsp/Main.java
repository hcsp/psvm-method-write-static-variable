package com.github.hcsp;

public class Main {
    public static String message = "Hello";

    public static void main(String[] args) {
        System.out.println(message);
        updatemessage();
        System.out.println(message);
    }

    public static void updatemessage() {
        message = "Hi";
        // Modify the static variable "message" to "Hi"
        // 将静态成员变量"message"的值改成"Hi"
    }
}
