package org.example;

public class Varju extends Madar {
    @Override
    public void move() {

    }

    @Override
    public void speak(int speakCount) {
        for (int i = 0; i < speakCount; i++) {
            System.out.println("Kárkár");
        }
    }
}
