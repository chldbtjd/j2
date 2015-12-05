package com.j2.state.gumballstate;
public class BrokenState implements State {
   GumballMachine gumballMachine;
   
     public BrokenState(GumballMachine gumballMachine) {
         this.gumballMachine = gumballMachine;
     }
  
  public void insertQuarter() {
   System.out.println("You can't insert a quarter. this Machine broken");
  }
  
  public void ejectQuarter() {
   System.out.println("this Machine broken");
  }
  
  public void turnCrank() {
   System.out.println("You can't turn the crank .this Machine broken");
  }
  
  public void dispense() {
   System.out.println("You can't returned a quarter, this Machine broken");
  }
  
  public String toString() {
   return "broken down this machine.....";
  }
}

