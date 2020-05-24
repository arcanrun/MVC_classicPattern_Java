package com.arcanrun.fxnotes.model;
import com.arcanrun.fxnotes.view.interfaces.main.Observer;

public interface Observable {
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifySubscribers();
    public void increase(int value);
    public void decrease(int value);
    public int getState();
}

