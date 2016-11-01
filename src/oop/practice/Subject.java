package oop.practice;

/**
 * Created by Roman on 30.10.2016.
 */
public interface Subject {

    public void registerObserver(InformingDevice infDev);
    public void removeObserver(InformingDevice infDev);
    public void notifyObservers();

}
