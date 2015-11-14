package com.j2.facade.hometheater.simple;
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("My Amplifier");
        Tuner tuner = new Tuner("My AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("My DVD Player", amp);
        Projector projector = new Projector("My Projector", dvd);
        Phone phone = new Phone("My Phone");
        Kakaotalk kakao = new Kakaotalk("My Kakaotalk",phone);
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector,phone,kakao);
        System.out.println("_________________________movie_____________");
        homeTheater.watchMovie("My Movie Watching...");
        homeTheater.endMovie();
        System.out.println("_________________________radio_____________");
        homeTheater.listenToRadio(5);
            homeTheater.endRadio();
            System.out.println("_________________________study_____________");
            homeTheater.beginStudy("end messeage");
            homeTheater.endStudy("Start messeage",5);
    }
}
