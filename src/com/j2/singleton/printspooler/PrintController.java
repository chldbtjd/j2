package com.j2.singleton.printspooler; 
 
 
 public class PrintController { 
   public static void main(String[] args) { 
      
     System.out.println("�����͸� ����մϴ� "); 
     PrintSpooler spooler1=PrintSpooler.getInstance(); 
       spooler1.Full();
    System.out.println("�����͸� ����մϴ�"); 
     PrintSpooler spooler2=PrintSpooler.getInstance(); 
   } 
 } 
