package com.github.mateuszhorczak;

public class Osoba {
    private String imie;
    private String nazwisko;



    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }
    public String toString() {
        return imie + " " + nazwisko;
    }


}
