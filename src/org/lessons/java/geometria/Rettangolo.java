package org.lessons.java.geometria;

public class Rettangolo {

    // ATTRIBUTI
    int base;
    int altezza;

    // COSTRUTTORI

    // Costruttore che permette di inserire come parametri la base e l'altezza
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }


    // METODI

    // Metodo che calcola l'area del rettangolo

    int calcolaArea() {
        return base * altezza;
    }

    int calcolaPerimetro() {
        return (2 * base) + (2 * altezza);
    }

    void reimpostaValori (int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    void disegna() {
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altezza - 1 || j == 0 || j == base - 1) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
