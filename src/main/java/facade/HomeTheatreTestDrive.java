package facade;

public class HomeTheatreTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("amplifier");
        Tuner tuner = new Tuner("tuner", amplifier);
        StreamingPlayer player = new StreamingPlayer("dvd player", amplifier);
        CdPlayer cdPlayer = new CdPlayer("cd player", amplifier);
        Projector projector = new Projector("projector", player);
        TheaterLights lights = new TheaterLights("lights");
        Screen screen = new Screen("screen");
        PopcornPopper popper = new PopcornPopper("popcorn popper");
        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amplifier, cdPlayer, player, popper,
                projector, screen, lights, tuner);
        homeTheatre.watchMovie("Shrek");
        homeTheatre.endMovie();

    }
}
