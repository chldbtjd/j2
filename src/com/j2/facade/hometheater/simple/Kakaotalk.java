package com.j2.facade.hometheater.simple;
public class Kakaotalk {
    String description;
    Phone phone;
    String messeage;
 
    public Kakaotalk(String description, Phone phone) {
        this.description = description;
        this.phone = phone;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void talk(String messeage) {
        this.messeage = messeage;
          System.out.println(description + " playing \"" + messeage + "\"");
    }
   
    public void stop() {
        System.out.println(description + " stopped \"" + messeage + "\"");
    }
    public String toString() {
        return description;
    }
}