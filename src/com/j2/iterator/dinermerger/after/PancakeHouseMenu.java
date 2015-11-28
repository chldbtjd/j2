package com.j2.iterator.dinermerger.after;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
           addItem("±èÄ¡Âî°³",
                "ÀßÀÍÀº ±èÄ¡·Î ²úÀÎ ±èÄ¡Âî°³", true, 1.99);
        addItem("µÈÀåÂî°³",
                "Á÷Á¢´ã±Ù µÈÀåÀ¸·Î ²úÀÎ µÈÀåÂî°³", false, 1.99);
        addItem("ºÎ´ëÂî°³",
                "Á÷Á¢¸¸µç À°¼ö¿Í ¼öÁ¦ÇÜÀ¸·Î ²úÀÎ ºÎ´ëÂî°³", false, 2.99);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
    // other menu methods here
}