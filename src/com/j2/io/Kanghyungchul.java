package com.j2.io;

public class Kanghyungchul extends Movie {
	
	public Kanghyungchul(){
		description="강형철";
		
	}
	@Override
	
	public int rate(){
		

		return 400; //공동제작한 영화를 제외한 본인제작 영화 관객수
	}

}
