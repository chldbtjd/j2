package com.j2.state.videoplayer;  
   
   
   
 public class PlayvideoState implements State {  
    VideoPlayer video;  
    
     public PlayvideoState(VideoPlayer video) {  
         this.video = video;  
     }  
 public void onVideoState(){
 System.out.println("already video on please");
 
 } 
 public void offVideoState(){
System.out.println("can't video off ");
 
 }  
 public void playVideoState(){
 System.out.println("playing video ");}
 public void endVideoState(){
System.out.println("end video. video off!"); 
 video.setState(video.getendVideoState());}
 public void display(){
    System.out.println("display is end goobbye ....");}  
      
 }  
