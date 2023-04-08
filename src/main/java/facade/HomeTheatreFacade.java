package facade;

public class HomeTheatreFacade {
    Amplifier amplifier;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    Tuner tuner;

    public HomeTheatreFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer,
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
}
