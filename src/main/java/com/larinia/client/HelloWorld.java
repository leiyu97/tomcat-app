package com.larinia.client;

public class HelloWorld {
    static boolean isActive = true;
    public static void  printMessage() {
        while(isActive) {
            System.out.println("HelloWorld.printMessage: Hello World!");
        }
    }

    public static void main (String args[]) {
        printMessage();
    }
}
