package com.j2.factory.shape;


public class TwoshapeMakingFactory implements ShapeMakingFactory {
	  public Color createColor() {
	        return new BlackColor();
	    }
	    public Shadow createShadow() {
	        return new HeavyShadow();
	    }
	    
	}