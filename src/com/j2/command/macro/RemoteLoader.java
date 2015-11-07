 package com.j2.command.macro; 
 
 public class RemoteLoader { 
  public static void main(String[] args) { 
   RemoteControlwithUndo remoteControl = new RemoteControlwithUndo(); 
 
   Light light = new Light("Living Room"); 
  DVD dvd = new DVD("Living Room"); 

   LightOnCommand lightOn = new LightOnCommand(light); 
   DVDOnCommand dvdOn = new DVDOnCommand(dvd); 
   LightoffCommand lightOff = new LightoffCommand(light); 
   DVDOffCommand dvdOff = new DVDOffCommand(dvd); 
 
 
  Command[] partyOn = { lightOn, dvdOn}; 
   Command[] partyOff = { lightOff, dvdOff}; 
    
   MacroCommand partyOnMacro = new MacroCommand(partyOn); 
   MacroCommand partyOffMacro = new MacroCommand(partyOff); 
   
   remoteControl.setCommand(0, partyOnMacro, partyOffMacro); 
    
   System.out.println(remoteControl); 
   System.out.println(" Macro On"); 
   remoteControl.onButtonWasPressed(0); 
   System.out.println(" Macro Off"); 
   remoteControl.offButtonWasPressed(0); 
   System.out.println("UNDO");
   remoteControl.undoButtonWasPressed();
  } 
 } 
