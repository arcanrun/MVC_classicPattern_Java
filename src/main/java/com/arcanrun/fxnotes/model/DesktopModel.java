package com.arcanrun.fxnotes.model;

import com.arcanrun.fxnotes.view.interfaces.main.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesktopModel implements Observable {
    private int state;
    List<Observer> views = new ArrayList<>();

    public DesktopModel() {
        this.state = 0;
    }

    public DesktopModel(Observer... observers) {
        views.addAll(Arrays.asList(observers));
        this.state = 0;
    }

    @Override
    public void subscribe(Observer o) {
        views.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        views.remove(o);
    }

    @Override
    public void notifySubscribers() {
        for (Observer o : views) {
            o.update();
        }
    }


    @Override
    public void increase(int value) {
        state += value;
        notifySubscribers();
    }

    @Override
    public void decrease(int value) {
        state -= value;
        notifySubscribers();
    }

    @Override
    public int getState() {
        return state;
    }

}
