package com.github.mateuszhorczak;

public class impl implements Kartoteka{
    private Osoba[] kartoteka;
    private int index;
    private int indexMax;


    public impl(Osoba[] kartoteka, int index) {
        this.kartoteka = kartoteka;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Osoba[] getKartoteka() {
        return kartoteka;
    }

    @Override
    public void dodaj(Osoba osoba) {
        
    }

    @Override
    public void usun(Osoba osoba) {

    }

    @Override
    public int rozmiar() {
        return 0;
    }

    @Override
    public boolean czyZawiera(Osoba osoba) {
        return false;
    }

    @Override
    public Object pobierz(int index) {
        return null;
    }
}
