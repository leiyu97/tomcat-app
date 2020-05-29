package com.larinia.client;

public class HelloWorld implements Runnable {
    static boolean isActive = true;

    public static void printMessage() {
        while (isActive) {
            System.out.println("HelloWorld.printMessage: Hello World!");
        }
    }

    public static void main(String args[]) {
        //printMessage();
        while (isActive) {
            HelloWorld hw = new HelloWorld();
            Thread t = new Thread(hw);

            try {
                t.sleep(2000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("HelloWorld.printMessage: Hello World!");
    }
}
