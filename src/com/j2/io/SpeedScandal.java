package com.j2.io;

public class SpeedScandal extends Coproduction {//공동제작한영화
	
	public SpeedScandal(Movie movie) {
		this.movie = movie;
	}

	public String getDescription() {
		return movie.getDescription() + ", speedscandal";
	}

	public int rate() {
		return 400 + movie.rate();// 과속스캔들 관객수에 영화관객수를더함.
		
	}	
}