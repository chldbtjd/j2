package com.j2.factory.shape;

public class ThreeshapeMakingFactory implements ShapeMakingFactory {
	  public Color createColor() {
	        return new WhiteColor();
	    }
	    public Shadow createShadow() {
	        return new LightShadow();
	    }
	    
	}