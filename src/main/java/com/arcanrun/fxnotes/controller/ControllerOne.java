package com.arcanrun.fxnotes.controller;

import com.arcanrun.fxnotes.model.Observable;
import com.arcanrun.fxnotes.view.interfaces.main.Observer;

public class ControllerOne implements StrategyOne {
    Observable model;
    Observer view;

    public ControllerOne(Observable model) {
        this.model = model;
    }

    @Override
    public void setView(Observer view) {
        this.view = view;
    }

    @Override
    public void increase(int value) {
        view.showLoadingScreen();
        model.increase(value);

    }

    @Override
    public void decrease(int value) {
        view.showLoadingScreen();
        model.decrease(value);
    }
}
