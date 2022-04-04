package com.github.mateuszhorczak.kartoteka.impl;

import com.github.mateuszhorczak.kartoteka.Osoba;

import java.util.List;
import java.util.Objects;

public class Kartoteka implements com.github.mateuszhorczak.kartoteka.Kartoteka {
    private List<Osoba> kartoteka;

    public Kartoteka(List<Osoba> kartoteka) {
        this.kartoteka = kartoteka;
    }

    public List<Osoba> getKartoteka() {
        return kartoteka;
    }

    @Override
    public void dodaj(Osoba osoba) {
        this.kartoteka.add(osoba);
    }

    @Override
    public void usun(Osoba osoba) {
        this.kartoteka.remove(osoba);
    }

    @Override
    public int rozmiar() {
        return this.kartoteka.size();
    }

    @Override
    public boolean czyZawiera(Osoba osoba) {
        return this.kartoteka.contains(osoba);
    }

    @Override
    public Object pobierz(int index) {
        return this.kartoteka.get(index);
    }

    public void print() {
        for (Osoba item : this.kartoteka) {
            System.out.println("[" + kartoteka.indexOf(item) + "] " + item);

            /*if (this.kartoteka.get(0) == null) {  // Nie dziala :(
                System.out.println("Kartoteka jest pusta!");
            }*/
        }
    }

    public Osoba find(String imie, String nazwisko) {
        for (Osoba item : this.kartoteka) {
            if (Objects.equals(item.getImie(), imie) || Objects.equals(item.getNazwisko(), nazwisko)) {
                return item;
            }
        }
        return null;
    }

    public void printMenu() {
        System.out.println("Menu");
        System.out.println("Dodac nowa osobe do kartoteki: 1");
        System.out.println("Usunac osobe z kartoteki: 2");
        System.out.println("Uzyskac rozmiar kartoteki: 3");
        System.out.println("Sprawdzic czy kartoteka kogos zawiera: 4");
        System.out.println("Pobrac osobe po indeksie: 5");
        System.out.println("Wypisac wszystkie osoby: 6");
        System.out.println("Wyswietl ponownie instrukcje: 7");
        System.out.println("Zakonczyc program: 0");
    }

}
