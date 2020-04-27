package com.larinia.app;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;

@WebListener
public class AppContextListener implements ServletContextListener {

     // log4j 2
    //private static final Logger logger = LogManager.getLogger();
    private static final Logger logger = Logger.getLogger("AppContextListener");
    TomcatLogging tcl;

    //@Override
    public void contextInitialized(ServletContextEvent evt) {
        ServletContext ctx = evt.getServletContext();
        //System.out.println("###### contextInitialized(): ServerInfo: " +
               // ctx.getServerInfo() + "########### " + System.currentTimeMillis());
        //System.out.println("contextInitialized(): ContextPath: " +
              //  ctx.getContextPath() + " " + System.currentTimeMillis());
        logger.info("contextInitialized(): ServerInfo: " +
                ctx.getServerInfo() + " " + System.currentTimeMillis());
        logger.info("contextInitialized(): ContextPath: " +
                ctx.getContextPath() + " " + System.currentTimeMillis());

        logger.warning("contextInitialized(): ServerInfo: " +
                ctx.getServerInfo() + " " + System.currentTimeMillis() +"error test");
        logger.warning("contextInitialized(): ContextPath: " +
                ctx.getContextPath() + " " + System.currentTimeMillis() +"error test");
        tcl = new TomcatLogging();
        tcl.start();
    }

    //@Override
    public void contextDestroyed(ServletContextEvent evt) {
        ServletContext ctx = evt.getServletContext();
       // System.out.println("contextDestroyed(): ServerInfo: " +
                //ctx.getServerInfo() + " " + System.currentTimeMillis());
       // System.out.println("contextDestroyed(): ContextPath: " +
               // ctx.getContextPath() + " " + System.currentTimeMillis());
        logger.info("contextDestroyed(): ServerInfo: " +
                ctx.getServerInfo() + " " + System.currentTimeMillis());
        logger.info("contextDestroyed(): ContextPath: " +
                ctx.getContextPath() + " " + System.currentTimeMillis());
        logger.warning("contextDestroyed(): ServerInfo: " +
                ctx.getServerInfo() + " " + System.currentTimeMillis() +"error test");
        logger.warning("contextDestroyed(): ContextPath: " +
                ctx.getContextPath() + " " + System.currentTimeMillis() +"error test");
        tcl.setAlive(false);
    }
}


