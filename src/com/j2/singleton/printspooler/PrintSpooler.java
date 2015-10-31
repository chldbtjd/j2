package com.j2.singleton.printspooler; 
 
 
 public class PrintSpooler { 
    private boolean inkempty;
    private boolean inkfull;
    private static int numCalled=0;  
    private static PrintSpooler uniqueInstance; 
    
   private PrintSpooler() {
   inkempty =true;
   inkfull =true;
   } 
    
   public static synchronized PrintSpooler getInstance() { 
     if(uniqueInstance ==null) { 
       uniqueInstance = new PrintSpooler(); 
       System.out.println("프린터와 연결이 성공했습니다. "); 
     } 
     else{ 
       System.out.println("지금 프린터가 사용중입니다."); 
     } 
     System.out.println("프린터가 "+ ++numCalled +"회 사용되었습니다"); 
       return uniqueInstance; 
   } 
   public void Full(){
    if (InkFull()) {
   inkempty = false;
   inkfull = true;
  
  }
 }
   public void Empty(){
     if(InkEmpty()){
       inkempty = true;
       inkfull = false;
     }
   }
   
   public boolean InkEmpty() {
  return inkempty;
 }
 
 public boolean InkFull() {
  return inkfull;
 }
 } 
