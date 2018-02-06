package personApp.model;

public class Person {
    String imie;
    String nazwisko;
    Long wiek;

    public Person(String imie, String nazwisko, Long wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(Long wiek) {
        this.wiek = wiek;
    }

    public String getImie() {

        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Long getWiek() {
        return wiek;
    }
}
