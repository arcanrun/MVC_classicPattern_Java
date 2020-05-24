package com.arcanrun.fxnotes;


import com.arcanrun.fxnotes.controller.ControllerOne;
import com.arcanrun.fxnotes.controller.StrategyOne;
import com.arcanrun.fxnotes.model.DesktopModel;
import com.arcanrun.fxnotes.model.Observable;
import com.arcanrun.fxnotes.view.consoleview.ConsoleView;
import com.arcanrun.fxnotes.view.interfaces.main.Observer;



public class Main {
    /*
    * todo:
    *  1. Search for the right pattern for JavaFxVew
    *
    * */
    public static void main(String[] args) {
        Observable modelOne = new DesktopModel();
        StrategyOne strategyOne = new ControllerOne(modelOne);

        Observer consoleView = new ConsoleView(modelOne, strategyOne);
        consoleView.start(args);




    }

}
