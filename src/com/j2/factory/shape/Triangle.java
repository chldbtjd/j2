package com.j2.factory.shape;

public class Triangle extends Shape {
	 ShapeMakingFactory makingFactory;
	 
	    public Triangle(ShapeMakingFactory makingFactory) {
	        this.makingFactory = makingFactory;
	    }
	    void colorprint() {
	    	System.out.println("Printing "+name);

	        color = makingFactory.createColor();
	        shadow = makingFactory.createShadow();
	    }
	}