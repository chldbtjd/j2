package com.j2.factory.pizzaaf.small;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore smstore = new SMPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
 
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = smstore.orderPizza("cheese");
        System.out.println("Yu ordered a"+pizza+"\n");
    
        pizza = smstore.orderPizza("potato");
        System.out.println("Choi ordered a"+pizza+"\n");
    
        pizza = chicagoStore.orderPizza("potato");
        System.out.println("Kim ordered a " + pizza + "\n");
        
         pizza = nyStore.orderPizza("potato");
        System.out.println("AHn ordered a " + pizza + "\n");
    }
}