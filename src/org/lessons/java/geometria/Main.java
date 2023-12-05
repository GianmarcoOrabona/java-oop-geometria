package org.lessons.java.geometria;

public class Main {
    public static void main(String[] args) {

        // Istanzio l'oggetto rettangolo
        Rettangolo rettangolo = new Rettangolo(20, 10);

        // Stampo a video le info dell'oggetto
        System.out.println("Base: " + rettangolo.base);
        System.out.println("Altezza: " + rettangolo.altezza);
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
        System.out.println("Area: " + rettangolo.calcolaArea());
    }
}
