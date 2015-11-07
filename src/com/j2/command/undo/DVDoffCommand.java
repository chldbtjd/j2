package com.j2.command.undo;

public class DVDoffCommand implements Command {
 DVD dvd;
 int level;
 public DVDoffCommand(DVD dvd){
   this.dvd = dvd;
 }
 public void execute(){
  level=dvd.getLevel();
   dvd.off(); 
 }
 public void undo(){
 dvd.power(level);
 }
}