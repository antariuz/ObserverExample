package model.impl;

import model.Observer;

public class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void showEvent(double price) {
        System.out.println("Good news " + name + ", we have the new scooter price. Only for " +
                price + "$");
    }
}
