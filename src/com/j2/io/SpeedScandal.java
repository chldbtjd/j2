package com.j2.io;

public class SpeedScandal extends Coproduction {//���������ѿ�ȭ
	
	public SpeedScandal(Movie movie) {
		this.movie = movie;
	}

	public String getDescription() {
		return movie.getDescription() + ", speedscandal";
	}

	public int rate() {
		return 400 + movie.rate();// ���ӽ�ĵ�� �������� ��ȭ������������.
		
	}	
}