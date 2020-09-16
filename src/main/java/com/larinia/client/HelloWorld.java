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
                //2000000 == 33 mins
                //change to 3 mins
                t.sleep(200000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("HelloWorld.printMessage: Hello World! time is "+ System.currentTimeMillis());
       // System.out.println("HelloWorld.run: check if JAVA_TOOL_OPTIONS has been picked up"+ System.getProperty("javax.net.ssl.keyStorePassword"));
       // System.out.println("HelloWorld.run: all properties " + System.getProperties());
    }
}
