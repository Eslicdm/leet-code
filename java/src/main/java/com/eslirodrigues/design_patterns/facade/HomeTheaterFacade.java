package com.eslirodrigues.design_patterns.facade;

// Provides a simplified interface to a library, a framework,
// or any other complex set of classes.

public class HomeTheaterFacade {
    private Amplifier amp;
    private StreamingPlayer player;
    private Projector projector;
    private TheaterLights lights;

    public HomeTheaterFacade(
            Amplifier amp, StreamingPlayer player,
            Projector projector, TheaterLights lights
    ) {
        this.amp = amp;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        projector.off();
        amp.off();
        player.off();
    }

    // Static method to demonstrate usage
    public static void call() {
        System.out.println("--- Facade Pattern ---");
        var amp = new Amplifier();
        var player = new StreamingPlayer();
        var projector = new Projector();
        var lights = new TheaterLights();

        var homeTheater = new HomeTheaterFacade(amp, player, projector, lights);

        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}