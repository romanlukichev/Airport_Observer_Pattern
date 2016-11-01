package oop.practice;

/**
 * Created by Roman on 30.10.2016.
 */
public class Widget extends InformingDevice implements Observer {
    @Override
    public void update( String inString , FlightState inState ) {
        System.out.println( "Widget: "  + inString + inState.toString()  );

    }
}
