package com.j2.adapter.Iterator;

import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {

Iterator iterator;
 public IteratorEnumeration(Iterator iterator){
 this.iterator=iterator;
 }
 public boolean hasMoreElements() {
  
  return this.iterator.hasNext();
 }

 
 public Object nextElement() {
  
  return this.iterator.next();
 }
 public void remove(){}
}