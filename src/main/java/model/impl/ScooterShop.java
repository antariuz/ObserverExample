package model.impl;

import model.Observed;
import model.Observer;

import java.util.ArrayList;
import java.util.List;

public class ScooterShop implements Observed {

    private double price;

    List<Observer> subscribers = new ArrayList<>();

    public void changePrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.showEvent(this.price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
