package com.alduthir;

public class Main {
    public static void main(String[] args) {
        // Reciever
        Light light = new Light();

        printLightState(light);

        // Command implementation
        TurnLightOn lightOn = new TurnLightOn(light);

        // Invoker
        Button btn = new Button(lightOn);

        // This will execute the command, resolving in the light's turnOn function.
        btn.onPress();
        printLightState(light);

//        TurnLightOff lightOff = new TurnLightOff(light);
//        lightOff.execute();
//
//        printLightState(light);
    }

    private static void printLightState(Light light) {
        System.out.printf("Base state of light is %s%n", light.status ? "On" : "Off");
    }
}
