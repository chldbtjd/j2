package com.j2.state.videoplayer;  
public class VedioPlayerTestDrive {  
  public static void main(String[] args) {  
   VideoPlayer video = new VideoPlayer("[Video]");  
   
   System.out.println("-----------------");  
    System.out.println(video);
   video.onVideoState();  
   video.playVideoState();   
   System.out.println(video);
   video.onVideoState();  
   video.playVideoState();  
   video.endVideoState();  
  video.offVideoState();  
  }  
 } 