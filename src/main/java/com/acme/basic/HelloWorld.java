package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
  }
//TODO
  void notCovered() {
    int target = -5;
    int num = 3;

    target =- num;  // Noncompliant; target = -3. Is that really what's meant?
    target =+ num; // Noncompliant; target = 3

    System.out.println("This method is not covered by unit tests");
    
  }
//TODO


}
