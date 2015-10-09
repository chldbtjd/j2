package com.j2.io;

public abstract class Movie {  
	String description = "Unknown Director";
	  
	public String getDescription() {
		return description;
	}
 
	public abstract int rate();
	
}