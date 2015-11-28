package com.j2.iterator.dinermerger.after;

import java.util.ArrayList;
//import com.j2.iterator.dinermerger.MenuItem;
public class PancakeHouseMenuIterator implements Iterator {
 //MenuItem[] items;
  ArrayList items;
  int position=0;
  public PancakeHouseMenuIterator(ArrayList items){
    this.items = items;
  }
  public boolean hasNext(){
    if(position>=items.size()) {
      return false;
    } else{
      return true;
    }
       }
public Object next() {
 Object object =(Object)items.get(position);
  position+=1;
  //return menuItem;
  return object;
}
}