package com.larinia.app; /**
 * Created by lyu on 15/06/16.
 */
//import org.jboss.security.JBossJSSESecurityDomain;

import javax.management.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SecondServlet extends HttpServlet {
    private String message;
    KeyStore truststore;
    FileInputStream input;

    private List<Integer> list;
    private static final int SIZE = 10;


    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World";

        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();


        //jmxConnections();

        String message = "I am here ";

        out.print(message);


        out.println("<h1> Tomcat app </h1>");

         refreshCopy();


    }

    public void destroy() {
        // do nothing.
    }

    public static void refreshCopy() {

        ClientCopy temp = new ClientCopy();
        temp.addMonths(-6, 5, 2021);
        temp.addMonths(-12, 5, 2021);
    }
}


