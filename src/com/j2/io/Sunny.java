package com.j2.io;

public class Sunny extends Coproduction {//���������ѿ�ȭ
	public Sunny(Movie movie) {
		this.movie = movie;
	}

	public String getDescription() {
		return movie.getDescription() + ", sunny";
	}

	public int rate() {
		return 700 + movie.rate();// ��ϰ������� ��ȭ�������� ����
		
	}	
}