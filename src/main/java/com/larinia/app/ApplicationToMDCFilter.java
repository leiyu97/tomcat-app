package com.larinia.app;

//import org.apache.log4j.MDC;

import javax.servlet.*;
import java.io.IOException;

public class ApplicationToMDCFilter implements javax.servlet.Filter {


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //MDC.put("user", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
       // MDC.put("application", request.getServletContext().getContextPath().replace("/", ""));
        System.out.println("ApplicationToMDCFilter.doFilter: request " + request.getServletContext().getContextPath().replace("/", ""));
       /* try {
            chain.doFilter(request, response);
        } finally {
            //MDC.remove("user");
        }*/
    }
}
