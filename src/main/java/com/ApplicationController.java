/**
 * The DedoMenaController program implements an application Controller  that
 * simply act as Engine to connect to Mongodb and Plugins to create PNR.
 *
 * @author  Delta
 * @version 1.0
 * @since   2017-12-01
 */
package com;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {


  private static Log logger = LogFactory.getLog(ApplicationController.class);

  /**
   *  Description:  Spring Cloud Integration.
   *
   *  @param     templateData Testing framework should send the input data to Engine.
   *  @return    response Json will send back to the requested Test client .
   *  @exception javax.xml.ws.http.HTTPException If the requested uri input data is invalid.
   */
  @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public <T> Object  testdata(@RequestBody String templateData) throws Exception {
    logger.info("DedoMenaController: "+templateData);
    return "";
  }

  @GetMapping("/health")
  public String health() {
    return "Heal check : "+"<static><head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>getting-started - 1.0.0-SNAPSHOT</title> </head> </static>";
  }


}
