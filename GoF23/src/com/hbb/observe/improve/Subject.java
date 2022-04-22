package com.hbb.observe.improve;

public interface Subject {
    void registerObserver(Observe o);

    void removeObserver(Observe o);

    void notifyObservers();
}
