package com.j2.singleton.printspooler; 
 
 
 public class PrintController { 
   public static void main(String[] args) { 
      
     System.out.println("프린터를 사용합니다 "); 
     PrintSpooler spooler1=PrintSpooler.getInstance(); 
       spooler1.Full();
    System.out.println("프린터를 사용합니다"); 
     PrintSpooler spooler2=PrintSpooler.getInstance(); 
   } 
 } 
