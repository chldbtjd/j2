package com.j2.io;

public class Choidonghun extends Movie{
	
	public Choidonghun(){
		description="최동훈";
		
	}
	@Override
	
	public int rate(){
		

		return 3000;//공동제작한 영화를 제외한 본인제작 영화 관객수
	}
	
}
