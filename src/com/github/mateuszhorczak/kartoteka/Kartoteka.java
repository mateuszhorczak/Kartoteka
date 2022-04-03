package com.github.mateuszhorczak.kartoteka;

public interface Kartoteka {
    public void dodaj(Osoba osoba);
    public void usun(Osoba osoba);
    public int rozmiar();
    public boolean czyZawiera(Osoba osoba);
    public Object pobierz(int index);
}
