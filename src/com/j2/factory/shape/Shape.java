package com.j2.factory.shape;



public abstract class Shape {
	 String name;
	 Shadow shadow;
	 Color color;
	    
	   abstract void colorprint() ;
	        	    
	    void shadowing() {
	        System.out.println("shadowing Shape");
	    }
	   
	    void setName(String name) {
	        this.name = name;
	    }
	    String getName() {
	        return name;
	    }
	    public String toString() {
	        StringBuffer result = new StringBuffer();
	        result.append("---- " + name + " ----\n");
	        if (shadow != null) {
	            result.append(shadow);
	            result.append("\n");
	        }
	        if (color != null) {
	            result.append(color);
	            result.append("\n");
	        }
	     
	        return result.toString();
	    }
	}