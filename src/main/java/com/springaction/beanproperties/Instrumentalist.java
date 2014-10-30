package com.springaction.beanproperties;

/**
 * Created by nanagarajan on 9/23/2014.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("Playing " + song + ":");
        instrument.play();
    }


}
