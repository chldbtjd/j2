package com.j2.command.undo;

public class LightoffCommand implements Command {
 Light light;
 int level;
 public  LightoffCommand(Light light){
   this.light = light;
 }
 public void execute(){
  level=light.getLevel();
   light.off(); 
 }
 public void undo(){
 light.dim(level);
 }
}