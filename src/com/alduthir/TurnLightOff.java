package com.alduthir;

public class TurnLightOff implements Command {
    private final Light light;

    public TurnLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
