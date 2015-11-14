package com.j2.adapter.Iterator;

import java.util.Enumeration;

public class EnumeratorIterator implements Iterator {

Enumeration enumeration;
 public EnumeratorIterator(Enumeration enumeration){
 this.enumeration=enumeration;
 }
 public boolean hasNext() {
  
  return this.enumeration.hasMoreElements();
 }

 
 public Object next() {
  
  return this.enumeration.nextElement();
 }
 public void remove(){}
 
 
}