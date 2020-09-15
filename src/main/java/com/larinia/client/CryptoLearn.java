package com.larinia.client;

import java.security.Provider;
import java.security.Security;
import java.util.Iterator;

public class CryptoLearn implements Runnable {

    static boolean isActive = false;

    /**
     * Basic class to confirm the Bouncy Castle provider is
     * installed.
     */

    public static void main(String[] args) {
        String providerName = "BC";
        CryptoLearn cry = new CryptoLearn();
        cry.bouncyCastleProvider();
        cry.listBCCapabilities();

        while (isActive) {
           // cryptoLearn cry = new cryptoLearn();
            Thread t = new Thread(cry);

            try {
                //2000000 == 33 mins
                //change to 3 mins
                t.sleep(200000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cry.bouncyCastleProvider();

            if (Security.getProvider(providerName) == null) {
                System.out.println(providerName + " provider not installed");
            } else {
                System.out.println(providerName + " is installed.");
            }
        }
    }

    public void bouncyCastleProvider() {
        // Security.addProvider((Provider) Class.forName(BouncyCastleMapper.getClassName(BouncyCastleMapper.BouncyCastleProvider)).newInstance());
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
    }

    public void listBCCapabilities() {
        Provider provider = Security.getProvider("BC");
        System.out.println("cryptoLearn.listBCCapabilities:"+provider.getInfo());

        Iterator it = provider.keySet().iterator();

        while (it.hasNext()) {
            String entry = (String) it.next();

            // this indicates the entry refers to another entry

            if (entry.startsWith("Alg.Alias.")) {
                entry = entry.substring("Alg.Alias.".length());
            }

            String factoryClass = entry.substring(0, entry.indexOf('.'));
            String name = entry.substring(factoryClass.length() + 1);

            System.out.println(factoryClass + ": " + name);
        }
    }

    @Override
    public void run() {
        System.out.println("cryptoLearn.run: Hello");
        listBCCapabilities();
    }
}
