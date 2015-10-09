package com.j2.io;



public class Tazza extends Coproduction { //공동제작한영화

	public Tazza(Movie movie) {
		this.movie = movie;
	}

	public String getDescription() {
		return movie.getDescription() + ", tazza";
	}

	public int rate() {
		return 800 + movie.rate();//타짜관객수에 영화관객수를 더함
		
	}	
}