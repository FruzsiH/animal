package org.example;

public class Kutya extends Emlos{

    @Override
    public void move() {
        System.out.println("Szalad");
    }
    @Override
    public void speak(int speakCount) {
        for (int i = 0; i < speakCount; i++) {
            System.out.println("Vauvau");
        }
    }

    public void wagTail() {
        System.out.println("Csóvál csóvál");
    }

}
