package com.company.design.observer;

public class Button {
    private String name;
    private IButtonListener buttonListener;

    public Button(String name){
        this.name = name;
    }

    public void click(String massage){
        buttonListener.clickEvent(massage);
    }

    public void addListener(IButtonListener buttonListener){
        this.buttonListener = buttonListener;
    }
}
