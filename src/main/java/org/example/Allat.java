package org.example;

public abstract class Allat {

    private int legCount;
    public int getLegCount() {
        return legCount;
    }
    public abstract void move();

    public abstract void speak(int speakCount);
    public void setLegCount( int legCount) {
        this.legCount = legCount;
    }
}
