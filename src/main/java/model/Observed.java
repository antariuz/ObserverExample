package model;

public interface Observed {
    void addObserver(Observer observer);
    void notifyObservers();
}
