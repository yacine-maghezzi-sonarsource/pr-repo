package com.acme.basic;

import java.util.logging.Logger;

public class HelloWorld {

  private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());

  void sayHello() {
    logger.info("Hello World!");
  }
//TODO
  void notCovered() {
    logger.info("This method is not covered by unit tests");
  }
//TODO


}
