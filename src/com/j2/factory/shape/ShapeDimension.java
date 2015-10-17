package com.j2.factory.shape;



public abstract class ShapeDimension  {
	 protected abstract Shape createShape(String item);
	 
	    public Shape orderShape(String type) {
	        Shape shape = createShape(type);
	        System.out.println("--- Making a " + shape.getName() + " ---");
	        shape.colorprint();
	        shape.shadowing();
	       
	        return shape;
	    }
	}