package com.j2.command.undo;

public class DoorOnCommand implements Command {
 Door door;
 int level;
 public  DoorOnCommand(Door door){
   this.door = door;
 }
 public void execute(){
  level=door.getLevel();
   door.on(); 
 }
 public void undo(){
 door.power(level);
 }
}