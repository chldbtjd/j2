package com.j2.factory.shape;


public class TwoDimension extends ShapeDimension{
    protected Shape createShape(String item) {
        Shape shape = null;
        ShapeMakingFactory makingFactory=new TwoshapeMakingFactory();
 
        if (item.equals("circle")) {
        	shape = new Circle(makingFactory);
            shape.setName("Two Dimension circle");
        }
        if (item.equals("triangle")){
        	  shape = new Triangle(makingFactory);
        	  shape.setName("Two Dimension triangle");
        }
        return shape;
    }
}