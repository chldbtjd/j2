package com.j2.io;

public class Sunny extends Coproduction {//공동제작한영화
	public Sunny(Movie movie) {
		this.movie = movie;
	}

	public String getDescription() {
		return movie.getDescription() + ", sunny";
	}

	public int rate() {
		return 700 + movie.rate();// 써니관객수에 영화관객수를 더함
		
	}	
}