package com.j2.factory.pizzafm;

public class PizzaTestDrive{
	  public static void main(String[] args) {
	    //SimplePizzaFactory fac=new SimplePizzaFactory();
	    PizzaStore nystore = new NYPizzaStore();
	   
	    Pizza pizza = nystore.orderPizza("cheese");
	    System.out.println("we ordered a"+pizza.getName()+"\n");
      	PizzaStore smstore = new SmStylePizzaStore();
      	pizza = smstore.orderPizza("potato");
      	System.out.println("we ordered a"+pizza.getName()+"\n");
	    
	  }
	}