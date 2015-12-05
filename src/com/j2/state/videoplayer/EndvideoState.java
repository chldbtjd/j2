package com.j2.state.videoplayer;  

public class EndvideoState implements State {  
   VideoPlayer video;  
   
    public EndvideoState(VideoPlayer video) {  
        this.video = video;  
    }  
  public void onVideoState(){
 System.out.println("video on please");
 
 } 
 public void offVideoState(){
System.out.println(" video off ");
 video.setState(video.getoffVideoState()); 
 }  
 public void playVideoState(){
 System.out.println("video on please ");
 video.setState(video.getplayVideoState());}
 public void endVideoState(){
System.out.println("already end video. video off!"); 

 }
 public void display(){
    System.out.println("display is end goobbye ....");}  
       
}  
