package com.j2.command.undo;

public class DooroffCommand implements Command {
 Door door;
 int level;
 public DooroffCommand(Door door){
   this.door = door;
 }
 public void execute(){
  level=door.getLevel();
   door.off(); 
 }
 public void undo(){
 door.power(level);
 }
}