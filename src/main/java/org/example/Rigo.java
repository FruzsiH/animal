package org.example;

public class Rigo extends Madar {

    @Override
    public void move() {
        System.out.println("ugrik");
    }

    @Override
    public void speak(int speakCount) {
        for (int i = 0; i < speakCount; i++) {
            System.out.println("Csipcsip");
        }
    }
}
