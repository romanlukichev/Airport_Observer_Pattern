package oop.practice;

/**
 * Created by Roman on 30.10.2016.
 */
public  class InformingDevice {
    public void update( String inString , FlightState state){
        System.out.println( "Informing Device: " + inString + state.toString());
    }

    public InformingDevice() {

    }
}
