package org.example;

public class Macska extends Emlos {

    @Override
    public void move() {
        System.out.println("Lépeget");
    }

    @Override
    public void speak(int speakCount) {
        for (int i = 0; i < speakCount; i++) {
            System.out.println("Miaú");
        }
    }

        public void purr () {
            System.out.println("Purr-purr");
        }

    }
