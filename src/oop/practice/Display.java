package oop.practice;

/**
 * Created by Roman on 30.10.2016.
 */
public class Display  extends InformingDevice  implements Observer {

    @Override
    public void update( String inString , FlightState inState) {
        System.out.println( "Display: "  + inString + inState.toString()  );

    }
}
