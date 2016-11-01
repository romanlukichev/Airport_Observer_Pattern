package oop.practice;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Roman on 30.10.2016.
 */
public class Flight   implements Subject   {  // this is superclass for all ConcreteSubjects in Observer design pattern
    private FlightState state;
    private Integer flightID;
    private String description;
    private ArrayList<InformingDevice> listOfInformingDevices;  // we keep the list of all observers

    public Flight(int flightID, String description, FlightState state ) {
        this.state = state;
        this.flightID = flightID;
        this.description = description;
        listOfInformingDevices = new ArrayList<InformingDevice>(); // allocating memory
    }

    public FlightState getState() {
        return this.state;
    }

    public void setState(FlightState state) {
        this.state = state;
        notifyObservers();
    }


    @Override
    public void registerObserver(InformingDevice infDev) {
        this.listOfInformingDevices.add(infDev);
    }

    @Override
    public void removeObserver(InformingDevice infDev) {
        this.listOfInformingDevices.remove(infDev);
    }

    public void notifyObservers(){
        Iterator<InformingDevice> infDevIt = listOfInformingDevices.iterator(); // we create iterator
        while (infDevIt.hasNext()){
            infDevIt.next().update( flightID.toString() + "." + description + " -> " , getState() );   // we notify all observers in the list
        }
    }
}
