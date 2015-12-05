package com.j2.state.videoplayer;  
   
 public class OnvideoState implements State {  
    VideoPlayer video;  
    
     public OnvideoState(VideoPlayer video) {  
         this.video = video;  
     }  
 public void onVideoState(){
 System.out.println("already video on please");
 
 } 
 public void offVideoState(){
System.out.println("video off");
 video.setState(video.getoffVideoState());
 }  
 public void playVideoState(){
 System.out.println("start to play video");
  video.setState(video.getplayVideoState());}
 public void endVideoState(){
System.out.println("end video"); }
 public void display(){
    System.out.println("wait to playing video ");}  
      
 } 
