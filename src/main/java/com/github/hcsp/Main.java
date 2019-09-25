package com.github.hcsp;

public class Main {
    public static String message = "Hello";

    public static void main(String[] args) {
        System.out.println(message);
        updateMessage();
        System.out.println(message);
    }

    public static void updateMessage() {
        // Modify the static variable "message" to "Hi"
        // 将静态成员变量"message"的值改成"Hi"
        // 直接赋值即可完成修改
        // static属性由类进行访问，但是最好由类进行修改，不能谁都对其进行修改
        // message = "Hi";
        Main.message = "Hi";
    }
}
