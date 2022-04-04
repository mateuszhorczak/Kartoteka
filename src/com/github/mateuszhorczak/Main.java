package com.github.mateuszhorczak;


import com.github.mateuszhorczak.kartoteka.Osoba;
import com.github.mateuszhorczak.kartoteka.impl.Kartoteka;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Kartoteka kartoteka = new Kartoteka(new ArrayList<Osoba>());
        int choice, ind;
        String imie, nazwisko;

        kartoteka.printMenu();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Co chcesz zrobic czlowieku?");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Podaj imie: ");
                imie = scanner.next();
                System.out.println("Podaj nazwisko: ");
                nazwisko = scanner.next();
                Osoba os = new Osoba(imie, nazwisko);
                kartoteka.dodaj(os);
            }

            if (choice == 2) {
                System.out.println("Podaj imie: ");
                imie = scanner.next();
                System.out.println("Podaj nazwisko: ");
                nazwisko = scanner.next();
                Osoba os = kartoteka.find(imie, nazwisko);

                if (!kartoteka.czyZawiera(os)) {
                    System.out.println("Nie mozna usunac tej osoby, poniewaz nie ma jej nawet w kartotece!");
                }
                else {
                    kartoteka.usun(os);
                    System.out.println("Poprawnie usunieto!");
                }
            }

            if (choice == 3) {
                System.out.println("Rozmiar kartoteki wynosi: " + kartoteka.rozmiar());
            }

            if (choice == 4) {
                System.out.println("Podaj imie: ");
                imie = scanner.next();
                System.out.println("Podaj nazwisko: ");
                nazwisko = scanner.next();
                Osoba os = kartoteka.find(imie, nazwisko);

                if (kartoteka.czyZawiera(os)) {
                    System.out.println("W kartotece znajduje sie: " + os);
                }
                else {
                    System.out.println("W kartotece nie ma: " + imie + " " + nazwisko);
                }
            }

            if (choice == 5) {
                System.out.println("Podaj index: ");
                ind = scanner.nextInt();
                System.out.println("Zwrocono: " + kartoteka.pobierz(ind));

            }

            if (choice == 6) {
                kartoteka.print();
            }

            if (choice == 7) {
                kartoteka.printMenu();
            }

            if (choice == 0) {
                System.out.println("Do widzenia!");
                break;
            }
        }
    }
}
