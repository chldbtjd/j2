package com.j2.io;


public class Cinema {

	public static void main(String[] args) {
		
		Movie moviedirecter = new Choidonghun();
		moviedirecter = new Tazza(moviedirecter);
		System.out.println(moviedirecter.getDescription() 
				+ "  공동제작 감독의 총 누적관객수   " + moviedirecter.rate()+"백만입니다.");
 
		Movie moviedirecter2 = new Kanghyungchul();
		moviedirecter2 = new Tazza(moviedirecter2);
		moviedirecter2 = new Sunny(moviedirecter2);
		moviedirecter2 = new SpeedScandal(moviedirecter2);
		System.out.println(moviedirecter2.getDescription() 
				+ "  공동제작 감독의 총 누적관객수   " + moviedirecter2.rate()+"백만입니다.");
 
		Movie moviedirecter3 = new Leebyunghuon();
		moviedirecter3 = new Sunny(moviedirecter3);
		moviedirecter3 = new SpeedScandal(moviedirecter3);
		
		System.out.println(moviedirecter3.getDescription() 
				+"  공동제작 감독의 총 누적관객수   " + moviedirecter3.rate()+"백만입니다.");

	}

}
