package com.j2.io;



public class Tazza extends Coproduction { //���������ѿ�ȭ

	public Tazza(Movie movie) {
		this.movie = movie;
	}

	public String getDescription() {
		return movie.getDescription() + ", tazza";
	}

	public int rate() {
		return 800 + movie.rate();//Ÿ¥�������� ��ȭ�������� ����
		
	}	
}