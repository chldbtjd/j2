package com.j2.adapter.Iterator;
 
import java.util.LinkedList;
import java.util.Vector;
public class Driver {
 public static void main(String args[]){
  LinkedList<String> list = new LinkedList<String>();
  list.add("��");
  list.add("��");
  list.add("��");
  list.add("��");
  list.add("��");
  IteratorEnumeration ie = new IteratorEnumeration(list.iterator());
  while(ie.hasMoreElements()){
   System.out.println(ie.nextElement());
  }
   System.out.println("_____________________________");
  
 Vector<String> v = new Vector<String>();
 v.add("��");
 v.add("��");
 v.add("��");
 v.add("��");
 v.add("��");
 
  EnumeratorIterator en = new EnumeratorIterator(v.elements());
    while(en.hasNext()){
       System.out.println(en.next());
    }
 }
}
