package com.j2.io;


public class Cinema {

	public static void main(String[] args) {
		
		Movie moviedirecter = new Choidonghun();
		moviedirecter = new Tazza(moviedirecter);
		System.out.println(moviedirecter.getDescription() 
				+ "  �������� ������ �� ����������   " + moviedirecter.rate()+"�鸸�Դϴ�.");
 
		Movie moviedirecter2 = new Kanghyungchul();
		moviedirecter2 = new Tazza(moviedirecter2);
		moviedirecter2 = new Sunny(moviedirecter2);
		moviedirecter2 = new SpeedScandal(moviedirecter2);
		System.out.println(moviedirecter2.getDescription() 
				+ "  �������� ������ �� ����������   " + moviedirecter2.rate()+"�鸸�Դϴ�.");
 
		Movie moviedirecter3 = new Leebyunghuon();
		moviedirecter3 = new Sunny(moviedirecter3);
		moviedirecter3 = new SpeedScandal(moviedirecter3);
		
		System.out.println(moviedirecter3.getDescription() 
				+"  �������� ������ �� ����������   " + moviedirecter3.rate()+"�鸸�Դϴ�.");

	}

}
