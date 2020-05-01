package javaExercises.sortowanieKolekcji;

public class Osoby {

    public String getImie() {
        return imie;
    }



    private String imie;
    private String nazwisko;

    public Osoby(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie+ " " +nazwisko;
    }
}
