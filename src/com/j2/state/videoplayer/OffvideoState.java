
package com.j2.state.videoplayer;  
   
 public class OffvideoState implements State {  
    VideoPlayer video;  
    
     public OffvideoState(VideoPlayer video) {  
         this.video = video;  
     }  
 public void onVideoState(){
 System.out.println("video on please");
 video.setState(video.getonVideoState());
 } 
 public void offVideoState(){
System.out.println("video off please inserted");
 
 }  
 public void playVideoState(){
 System.out.println("video off insert please");}
 public void endVideoState(){
System.out.println("already video end insert please"); }
 public void display(){
    System.out.println("display is off ....");}  
      
 } 
