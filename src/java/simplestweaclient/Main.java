/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestweaclient;

import javax.naming.Context;
import javax.naming.InitialContext;
import firststeps.HelloWorld;

public class Main {
 public static void main(String [] args) {
  try {
    Context context = new InitialContext();
    HelloWorld hello = (HelloWorld)context.lookup("java:global/SimplestWEA/SimplestWEA-ejb/HelloWorldBean!firststeps.HelloWorld");
    String helloS = hello.sayHello("fr", "James Bond");
    System.out.println(helloS);
  } catch (Exception ex) {
    ex.printStackTrace();
  }
} 
}