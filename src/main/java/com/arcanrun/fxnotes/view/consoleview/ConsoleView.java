package com.arcanrun.fxnotes.view.consoleview;

import com.arcanrun.fxnotes.controller.StrategyOne;
import com.arcanrun.fxnotes.model.Observable;
import com.arcanrun.fxnotes.view.interfaces.main.Observer;

import java.util.Scanner;

public class ConsoleView implements Observer {
    private Observable model;
    private StrategyOne controller;
    private Scanner scan;


    public ConsoleView(Observable model, StrategyOne controller) {
        this.model = model;
        this.controller = controller;
        this.controller.setView(this);
        this.model.subscribe(this);
        scan = new Scanner(System.in);
    }

    @Override
    public void start(String ...args) {
        String input = "";
        while (!input.equals("/exit")) {
            System.out.println("Enter number: ");
            input = scan.nextLine();
            try {

                int value = Integer.parseInt(input);
                System.out.println("Enter operator: + -");
                input = scan.nextLine(); // operator
                makeOperation(input, value);

            } catch (NumberFormatException e) {
                System.out.println("Incorrect input");
            }
        }
        scan.close();

    }

    @Override
    public void showLoadingScreen() {
        System.out.println("...");
    }

    private void makeOperation(String operation, int value) {
        if (isCorrect(operation)) {
            if (operation.contains("+")) controller.increase(value);
            if (operation.contains("-")) controller.decrease(value);
        } else {
            System.out.println("Incorrect operation");
        }
    }

    private boolean isCorrect(String operation) {
        return operation.contains("+") || operation.contains("-");
    }


    @Override
    public void update() {
        display();
    }

    public void display() {
        System.out.println(this.model.getState());
    }



}
