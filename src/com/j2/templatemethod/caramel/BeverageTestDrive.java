package com.j2.templatemethod.caramel;
public class BeverageTestDrive {
 public static void main(String[] args) {
 

  CaramelMacchiato coffee = new CaramelMacchiato();
 
 
  System.out.println("\nMaking caramelmacchiato...");
  coffee.prepareRecipe();

 
 System.out.println("\nWithHook-------------------------------");
  CaramelMacchiatoWithHook caramelmacchiatohook = new CaramelMacchiatoWithHook();

 
  System.out.println("\nMaking caramelmacchiato...");
 caramelmacchiatohook.prepareRecipe();
 }
}