package com.vikram.designpatterns.facade;

public class HomeTheaterFacade {
    private final Amplifier amplifier = new Amplifier();
    private final Projector projector = new Projector();

    public String watchMovie(String title) {
        return amplifier.on() + ", " + projector.on() + ", playing " + title;
    }
}
