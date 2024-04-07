import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public abstract class Pracownik implements Comparable, Comparator {

    static ArrayList<Pracownik> listaPracownikow = new ArrayList<>();

    protected String imie, nazwisko;
    protected Date data;

    protected Dzial dzial;

    public Pracownik(String imie, String nazwisko, Date data, Dzial dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
        this.dzial = dzial;
    }


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Date getData() {
        return data;
    }

    public Dzial getDzial() {
        return dzial;
    }
//
//    @Override
//    public int compareTo(Pracownik o1) {
//        int result;
//        if (this.nazwisko.equalsIgnoreCase(o1.nazwisko)) {
//            result = 0;
//        } else {
//            result = 1;
//        }
//        //TODO - metoda nie zwraca negatywnej metody
//        return result;
//    }



    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Pracownik::getImie)
                .thenComparing(Pracownik::getNazwisko)
               .compare(this, (Pracownik) o);
    }
}
