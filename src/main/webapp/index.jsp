<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cluster counter</title>
    </head>
    <body>
        <h1>Hello World!</h1>
          <!--% System.out.println("System.getProperties() is ######## "+System.getProperties()--);

          System.getProperties();


          System.out.println("System.getProperties(truststore password) is >>>>>> "+System.getProperty("javax.net.ssl.trustStorePassword"));

          System.out.println("System.getProperties(keystore password) is >>>>>>###>>>> "+System.getProperty("javax.net.ssl.keyStorePassword"));
          //starting threads
          TomcatLogging tl = new TomcatLogging();
          tl.start();
          %>




        <table>
        <tr><td> fifth version of my-app</tr></td>
            <tr><td>java.net.InetAddress.getLocalHost().getHostName():</td><td><%=java.net.InetAddress.getLocalHost().getHostName()%></td></tr>
            <tr><td>system properties:</td>  <td><%=System.getProperties()%> </td></tr>
        </table>

    </body>
</html>
