package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Istanzio l'oggetto rettangolo
        Rettangolo rettangolo = new Rettangolo(20, 10);

        // chiedo all'utente di ridefinire gli attributi
        System.out.println("Inserisci le dimensioni del rettangolo");

        // Base
        System.out.println("Base: ");
        int newBase = Integer.parseInt(scanner.nextLine());

        // Altezza
        System.out.println("Altezza: ");
        int newAltezza = Integer.parseInt(scanner.nextLine());

        // Reimposto i valori tramite il metodo reimpostaValori
        rettangolo.reimpostaValori(newBase, newAltezza);

        // Stampo a video le info dell'oggetto
        System.out.println("Base: " + rettangolo.base);
        System.out.println("Altezza: " + rettangolo.altezza);
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
        System.out.println("Area: " + rettangolo.calcolaArea());

        // Stampare il rettangolo
        rettangolo.disegna();

        scanner.close();
    }
}
