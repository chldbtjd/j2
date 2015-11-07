package com.j2.command.undo;
public class Door{
int level;
String location;
  public Door(String location){
  this.location=location;
}
public int getLevel(){
  return level;
}
  public void on(){
  level = 100;
  System.out.println("garageDoor is open");
}
public void off(){
  level = 0;
  System.out.println("garageDoor is close");
}
public void power(int level){
  this.level = level;
  if(level == 0){
    off();
  }
  else {
  System.out.println("Gragedoor is Powerlevel" + level);
  }
  }
}