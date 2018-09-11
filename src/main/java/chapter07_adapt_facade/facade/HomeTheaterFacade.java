package chapter07_adapt_facade.facade;

/**
 * @author yangyh
 * @date 2018/9/11
 */
public class HomeTheaterFacade {

    Amplifier amplifier;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    TheaterLights theaterLights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, PopcornPopper popcornPopper, Projector projector, Screen screen, TheaterLights theaterLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    void watchMovie(String movice){
        System.out.println("start");

    }

    void endMovie(String movice){
        System.out.println("end");

    }

}
