package com.github.mateuszhorczak;


import com.github.mateuszhorczak.kartoteka.Osoba;
import com.github.mateuszhorczak.kartoteka.impl.Kartoteka;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Kartoteka kartoteka = new Kartoteka(new ArrayList<Osoba>());
        Osoba os = new Osoba("Jank", "Janowski");
        kartoteka.dodaj(new Osoba("Jan", "Janowski"));
        kartoteka.dodaj(new Osoba("Jana", "Janowski"));
        kartoteka.dodaj(os);
        kartoteka.print();
        kartoteka.usun(os);
        System.out.println(kartoteka.rozmiar());
        kartoteka.print();
        System.out.println("Zwrocono: " + kartoteka.pobierz(1));
    }
}
