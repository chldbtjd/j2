package com.j2.factory.pizzafm;

public class SmStylePizzaStore extends PizzaStore {
	Pizza createPizza(String item) {
		if (item.equals("potato")) {
			return new SmStylePotatoPizza();
		
		} else return null;
	}
}