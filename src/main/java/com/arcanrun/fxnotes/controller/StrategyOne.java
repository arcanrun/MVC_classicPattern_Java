package com.arcanrun.fxnotes.controller;

import com.arcanrun.fxnotes.view.interfaces.main.Observer;

public interface StrategyOne {
    public void increase(int value);
    public void decrease(int value);
    public void setView(Observer observer);
}
