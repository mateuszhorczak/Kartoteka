package com.github.mateuszhorczak;


import com.github.mateuszhorczak.kartoteka.Osoba;
import com.github.mateuszhorczak.kartoteka.impl.Kartoteka;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Kartoteka kartoteka = new Kartoteka(new ArrayList<Osoba>());
        Osoba os = new Osoba("Stefan", "Stefanski");
        kartoteka.dodaj(new Osoba("Maciej", "Maciejewski"));
        kartoteka.dodaj(new Osoba("Halina", "Halinowska"));
        kartoteka.dodaj(os);
        kartoteka.print();
        kartoteka.usun(os);
        System.out.println(kartoteka.rozmiar());
        kartoteka.print();
        System.out.println("Zwrocono: " + kartoteka.pobierz(1));
    }
}
