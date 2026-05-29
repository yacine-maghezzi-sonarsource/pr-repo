package com.acme.basic;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.sayHello();
    assertNotNull(helloWorld);
  }
}
