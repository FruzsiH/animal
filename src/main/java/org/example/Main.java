package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Szia! Valassz egy allatot: kutya, macska, rigo, varju");
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.next();
        System.out.println("Hányszor beszéljen?");
        int speakCount = scanner.nextInt();


        if (!animal.equalsIgnoreCase("kutya")
                && !animal.equalsIgnoreCase("macska")
                && !animal.equalsIgnoreCase("rigo")
                && !animal.equalsIgnoreCase("varju")) {
            System.out.println("Hiba");
        }

        if (animal.equalsIgnoreCase("kutya")) {
            Kutya george = new Kutya();
            george.speak(speakCount);
            george.move();
            george.wagTail();
            System.out.println(String.format("Lábszám: %d", george.getLegCount()));
        }

        if (animal.equalsIgnoreCase("macska")) {
            Macska lois = new Macska();
            lois.purr();
            lois.speak(speakCount);
            lois.move();
            System.out.println(String.format("Lábszám: %d", lois.getLegCount()));
        }

        if (animal.equalsIgnoreCase("varju")) {
            Varju varju = new Varju();
            varju.move();
            varju.fly();
            varju.speak(speakCount);
            System.out.println(String.format("Lábszám: %d", varju.getLegCount()));
        }

        if (animal.equalsIgnoreCase("rigo")) {
            Rigo rigo = new Rigo();
            rigo.move();
            rigo.fly();
            rigo.speak(speakCount);
            System.out.println(String.format("Lábszám: %d", rigo.getLegCount()));
        }
    }
}