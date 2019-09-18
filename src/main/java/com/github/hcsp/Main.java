package com.github.hcsp;

public class Main {
    public static String Hi = "Hello";

    public static void main(String[] args) {
        System.out.println(Hi);
        updateHi();
        System.out.println(Hi);
    }

    public static void updateHi() {
        // Modify the static variable "message" to "Hi"
        // 将静态成员变量"message"的值改成"Hi"
    }
}
