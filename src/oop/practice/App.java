package oop.practice;

public class App {

    public static void main(String[] args) {

        // create a few subjects
	     Flight flight767 = new CharterFlight(767 , "charterFlight" , FlightState.BOARDING );
         Flight flight768 = new CharterFlight(768 , "charterFlight" , FlightState.ARRIVED );
         Flight flight769 = new RegularFlight(769 , "regularFlight" , FlightState.FLYING );

        // create a few observers
        InformingDevice myDisplay = new Display();
        InformingDevice myMobile = new Mobile();
        InformingDevice mySMS = new SMS();
        InformingDevice myWidget = new Widget();


        flight769.registerObserver(myMobile);
        flight769.registerObserver(myDisplay);
        flight769.registerObserver(myWidget);
        flight769.registerObserver(mySMS);

        flight768.registerObserver(myMobile);

        System.out.println("=========== Changing status to arrived ================");
        flight769.setState(FlightState.ARRIVED);
        flight768.setState(FlightState.ARRIVED);

        System.out.println("=========== Changing status to boarding ================");
        flight769.setState(FlightState.BOARDING);

        System.out.println("=========== Changing status to flying ================");
        flight769.setState(FlightState.FLYING);


        System.out.println("=========== Removed Mobile, Display, SMS observers. ======="  );
        System.out.println("=========== And changed status to boarding ================");


        flight769.removeObserver(myMobile);
        flight769.removeObserver(myDisplay);
        flight769.removeObserver(mySMS);

        flight769.setState(FlightState.BOARDING);
        flight768.setState(FlightState.BOARDING);



    }
}
