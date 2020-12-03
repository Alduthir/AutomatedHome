package com.alduthir;

public class Button {
    private final Command onPush;

    public Button(Command command) {
        this.onPush = command;
    }

    public void onPress() {
        onPush.execute();
    }
}
