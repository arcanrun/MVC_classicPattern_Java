package com.arcanrun.fxnotes.view.interfaces.main;

public interface Observer {
    public void update();
    public void start(String ...args);
    public void showLoadingScreen();
}
