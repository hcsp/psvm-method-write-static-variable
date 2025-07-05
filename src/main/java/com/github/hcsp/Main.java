package com.github.hcsp;

public class Main {           // Main类
    public static String message = "Hello";      //Main类的成员变量 message

    public static void main(String[] args) {        //程序入口
        System.out.println(message);
        updateMessage();                 //函数调用
        System.out.println(message);
    }

    public static void updateMessage() {         //函数声明
        // Modify the static variable "message" to "Hi"
        // 将静态成员变量"message"的值改成"Hi"
        message = "Hi";
    }
}
