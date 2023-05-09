package DesignPatterns.Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }


    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        observers.remove(deleteObserver);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(ibmPrice,applPrice,googPrice);
        }
    }


    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice=newIBMPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGoogPrice){
        this.googPrice=newGoogPrice;
        notifyObserver();
    }

    public void setApplPrice(double newApplPrice){
        this.applPrice=newApplPrice;
        notifyObserver();
    }

}
