package com.j2.state.videoplayer;  
 public class VideoPlayer {  
    
State onVideoState;  
 State offVideoState;  
State playVideoState;  
 State  endVideoState;
  State state;  
    String title = null;
  public VideoPlayer(String title) {  
 onVideoState = new OnvideoState(this);  
  offVideoState = new OffvideoState(this);   
  playVideoState = new PlayvideoState(this);  
   endVideoState = new EndvideoState(this); 
  this.title = title;  
    if (title != null) {  
    state = offVideoState;  
  } else {  
    state = endVideoState;  
   }  
 }  

  
    
  public void playVideoState() {  
   state.playVideoState();  
  }  
    
  public void onVideoState() {  
   state.onVideoState();  
  }  
    
  public void offVideoState() {  
   state.offVideoState();  
 }  
  public void endVideoState(){
  state.endVideoState();
  }
   
 void setState(State state) {  
   this.state = state;  
  }  
       
 public State getState() {  
    return state;  
  }  
  
  public State getonVideoState() {  
    return onVideoState;  
  }  
 
  public State getoffVideoState() {  
    return offVideoState;  
  }  
  
    public State getplayVideoState() {  
         return playVideoState;  
     }  
  
     public State getendVideoState() {  
         return endVideoState;  
     }  
 }
