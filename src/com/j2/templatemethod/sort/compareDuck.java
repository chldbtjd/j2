package com.j2.templatemethod.sort; 
 import java.util.*; 
 public class compareDuck implements Comparator<Duck> { 
   public int compare(Duck d1, Duck d2) {    
    if (d1.weight < d2.weight) { 
      return -1; 
    }  
    else if (d1.weight == d2.weight) {
      return 0; 
    }  
    else { 
      return 1; 
    }  
  } 
 } 
