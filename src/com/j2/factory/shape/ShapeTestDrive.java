package com.j2.factory.shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        
    	ShapeDimension twodimension = new TwoDimension();     
        ShapeDimension threedimension = new ThreeDimension();
        
        
        
        Shape shape = threedimension.orderShape("triangle");
        System.out.println(  shape + "\n");
 
        shape = twodimension.orderShape("circle");
        System.out.println( shape + "\n");
        
        shape = threedimension.orderShape("circle");
        System.out.println( shape + "\n");
       
        shape = twodimension.orderShape("triangle");
        System.out.println( shape + "\n");
    }
}