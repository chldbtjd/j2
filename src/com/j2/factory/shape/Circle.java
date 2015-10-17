package com.j2.factory.shape;

public class Circle extends Shape{
	 ShapeMakingFactory makingFactory;
	 
	    public Circle(ShapeMakingFactory makingFactory) {
	        this.makingFactory = makingFactory;
	    }
	    void colorprint() {
	    	System.out.println("Printing "+name);

	        color = makingFactory.createColor();
	        shadow = makingFactory.createShadow();
	    }
	}
