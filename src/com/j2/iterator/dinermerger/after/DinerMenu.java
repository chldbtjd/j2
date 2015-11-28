package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("±èÄ¡Âî°³",
                "ÀßÀÍÀº ±èÄ¡·Î ²úÀÎ ±èÄ¡Âî°³", true, 1.99);
        addItem("µÈÀåÂî°³",
                "Á÷Á¢´ã±Ù µÈÀåÀ¸·Î ²úÀÎ µÈÀåÂî°³", true, 1.99);
        addItem("ºÎ´ëÂî°³",
                "Á÷Á¢¸¸µç À°¼ö¿Í ¼öÁ¦ÇÜÀ¸·Î ²úÀÎ ºÎ´ëÂî°³", true, 2.99);
       
   
 }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    // other menu methods here
}