package com.j2.command.undo;
public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlwithUndo remote = new RemoteControlwithUndo();
    
    Light light = new Light("Living Room");
    LightOnCommand livingRoomLightOn = new LightOnCommand(light);
    LightoffCommand livingRoomLightOff = new LightoffCommand(light);
    remote.setCommand(0,livingRoomLightOn,livingRoomLightOff);
    remote.onButtonWasPressed(0);
    remote.offButtonWasPressed(0);
    remote.undoButtonWasPressed();
   System.out.println("_______________________");
    DVD dvd = new DVD("DVD player");
    DVDOnCommand dvdon = new DVDOnCommand(dvd);
       DVDoffCommand dvdoff = new DVDoffCommand(dvd);
       remote.setCommand(0,dvdon,dvdoff);
       remote.onButtonWasPressed(0);
    remote.offButtonWasPressed(0);
    remote.undoButtonWasPressed();
      System.out.println("_______________________");
    
     
    Door door = new Door("Garage door");
    DoorOnCommand dooron = new DoorOnCommand(door);
       DooroffCommand dooroff = new DooroffCommand(door);
       remote.setCommand(0,dooron,dooroff);
       remote.onButtonWasPressed(0);
    remote.offButtonWasPressed(0);
    remote.undoButtonWasPressed();
  }
}
    