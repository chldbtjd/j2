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
       System.out.println("�����Ϳ� ������ �����߽��ϴ�. "); 
     } 
     else{ 
       System.out.println("���� �����Ͱ� ������Դϴ�."); 
     } 
     System.out.println("�����Ͱ� "+ ++numCalled +"ȸ ���Ǿ����ϴ�"); 
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
