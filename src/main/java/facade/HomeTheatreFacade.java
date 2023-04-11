package facade;

public class HomeTheatreFacade {
    Amplifier amplifier;
    CdPlayer cdPlayer;
    StreamingPlayer dvdPlayer;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    Tuner tuner;

    public HomeTheatreFacade(Amplifier amplifier, CdPlayer cdPlayer, StreamingPlayer dvdPlayer,
                             PopcornPopper popper, Projector projector,
                             Screen screen, TheaterLights lights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.tuner = tuner;
    }
    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(dvdPlayer);
        amplifier.setStereoSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }
    public void listenToCd(){}
    public void endCd(){}
    public void listenToRadio(){}
    public void endRadio(){}


}
