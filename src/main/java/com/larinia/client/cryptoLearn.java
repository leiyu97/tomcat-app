package com.larinia.client;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.*;

public class cryptoLearn {


    /**
     * Basic class to confirm the Bouncy Castle provider is
     * installed.
     */

    public static void main(String[] args) {
        String providerName = "BC";

        cryptoLearn cry = new cryptoLearn();
        cry.bouncyCastleProvider();

        if (Security.getProvider(providerName) == null) {
            System.out.println(providerName + " provider not installed");
        } else {
            System.out.println(providerName + " is installed.");
        }
    }

    public void bouncyCastleProvider() {
       // Security.addProvider((Provider) Class.forName(BouncyCastleMapper.getClassName(BouncyCastleMapper.BouncyCastleProvider)).newInstance());
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
    }
}
