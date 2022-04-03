package com.github.mateuszhorczak.kartoteka.impl;

import com.github.mateuszhorczak.kartoteka.Osoba;

import java.util.List;

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
        for (var item : this.kartoteka) {
            System.out.println(item);
        }
    }
}
