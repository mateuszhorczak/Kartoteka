package com.github.mateuszhorczak.kartoteka.mockup;

import com.github.mateuszhorczak.kartoteka.Osoba;

public class Kartoteka implements com.github.mateuszhorczak.kartoteka.Kartoteka {

    @Override
    public void dodaj(Osoba osoba) { }

    @Override
    public void usun(Osoba osoba) { }

    @Override
    public int rozmiar() {
        return 1;
    }

    @Override
    public boolean czyZawiera(Osoba osoba) {
        return true;
    }

    @Override
    public Object pobierz(int index) {
        return new Osoba("Gall", "Anonim");
    }

}
