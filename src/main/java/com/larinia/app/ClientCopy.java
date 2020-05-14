package com.larinia.app;

import org.jboss.logging.Logger;

/**
 * Created by lyu on 15/05/17.
 */
public class ClientCopy {

   // Logger log = Logger.getLogger(ClientCopy.class.getName());
    private static final Logger log = Logger.getLogger(ClientCopy.class);

    final public void addMonths(int iCount, int lMonth, int lYear) {
        byte[] bTmp = {0, 0, 0, 0, 0, 0, 0};
      //  int lMonth = 5;
       // int lYear = 2021;

        log.debug("a TRACE-ADDMONTH==>> iCount[" + iCount + "] lMonth[" + lMonth + "] lYear[" + lYear + "]");

        lMonth += (iCount - 1);
        lYear += (lMonth / 12);

        log.debug("b TRACE-ADDMONTH==>> iCount[" + iCount + "] lMonth[" + lMonth + "] lYear[" + lYear + "]");


        if (lMonth < 0) {

            while(lMonth < 0) {
                lMonth += 12;
            }
            log.debug("c BEGIN TRACE-ADDMONTH==>> iCount[" + iCount + "] lMonth[" + lMonth + "] lYear[" + lYear + "] (lMonth > 0)=" + (lMonth > 0));
            if (lMonth > 0)
            {
                lYear -= 1;
                log.debug("d IN TRACE-ADDMONTH==>> iCount[" + iCount + "] lMonth[" + lMonth + "] lYear[" + lYear + "]");
            }
            log.debug("e END TRACE-ADDMONTH==>> iCount[" + iCount + "] lMonth[" + lMonth + "] lYear[" + lYear + "]");
        } else {
            lMonth %= 12;
        }

        log.debug("f TRACE-ADDMONTH==>> iCount[" + iCount + "] lMonth[" + lMonth + "] lYear[" + lYear + "]");
    }
}
