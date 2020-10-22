package com.larinia.client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

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

        URL url = null;
        try {
            url = new URL("https://www.google.co.uk/");

            URLConnection urlc = url.openConnection();

            urlc.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    urlc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();

            System.out.println("HelloWorld.main" +urlc.getContent().toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        System.out.println("HelloWorld.printMessage: Hello World! time is "+ System.currentTimeMillis());
       // System.out.println("HelloWorld.run: check if JAVA_TOOL_OPTIONS has been picked up"+ System.getProperty("javax.net.ssl.keyStorePassword"));
       // System.out.println("HelloWorld.run: all properties " + System.getProperties());
    }
}
