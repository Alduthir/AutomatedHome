package com.alduthir;

public class TurnLightOn implements Command {
    private final Light light;

    public TurnLightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
