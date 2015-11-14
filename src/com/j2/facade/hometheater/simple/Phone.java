package com.j2.facade.hometheater.simple;
public class Phone {
    String description;
    Kakaotalk kakao;
    public Phone(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void startKakao(Kakaotalk kakao) {
        System.out.println(description + " setting DVD player to " + kakao);
        this.kakao = kakao;
    }
    
    
    public String toString() {
        return description;
    }
}
