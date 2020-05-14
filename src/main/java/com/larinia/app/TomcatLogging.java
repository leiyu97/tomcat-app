package com.larinia.app;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;



import java.util.logging.Logger;

public class TomcatLogging extends Thread {
    //private static final Logger logger = Logger.getLogger(TomcatLogging.class);
    //private Logger logger = LogManager.getLogger("TomcatLogging");

    private Logger logger = Logger.getLogger ("TomcatLogging");

    boolean isAlive = false; //set false for now, don't want the logging
    int count=0;

    public void run() {
        logger.info(" In the run method: start and isAlive is "+isAlive);
        while (isAlive) { // isAlive is a global-level (static, even) boolean
            // you declared earlier as true, your app should set it to false
            // if your app decides to exit
            logger.info(" ###### in while loop");
            try {
                logger.info("Rollover Log Text "+ count++ +" times");
                logger.info("in the run method, logging info ");
                logger.warning("in the run method logging error ");
                Thread.currentThread().sleep(1000 * 6); // 60 seconds
            } catch (InterruptedException ignore) {
            }
        }
    }

    public void setAlive(boolean a) {
        this.isAlive = a;
    }
}
