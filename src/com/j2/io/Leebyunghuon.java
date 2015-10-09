package com.j2.io;

public class Leebyunghuon extends Movie {
	
	public Leebyunghuon(){
		description="이병헌";
		
	}
	@Override
	
	public int rate(){
		

		return 300;//공동제작한 영화를 제외한 본인제작 영화 관객수
	}

}
