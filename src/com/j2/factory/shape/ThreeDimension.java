package com.j2.factory.shape;

public class ThreeDimension extends ShapeDimension{
    protected Shape createShape(String item) {
        Shape shape = null;
        ShapeMakingFactory makingFactory=new ThreeshapeMakingFactory();
 
        if (item.equals("circle")) {
        	shape = new Circle(makingFactory);
            shape.setName("Three Dimension circle");
        }
        if (item.equals("triangle")){
        	  shape = new Triangle(makingFactory);
        	  shape.setName("Three Dimension triangle");
        }
        return shape;
    }
}