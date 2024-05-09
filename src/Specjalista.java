import java.util.Date;

public class Specjalista extends Pracownik{


    public static int licznik = 0;

    int numer;

    protected String specjalizacja;


    public Specjalista(String imie, String nazwisko, Date data, Dzial dzial, String specjalizacja) {
        super(imie, nazwisko, data, dzial);
        this.specjalizacja = specjalizacja;
        listaPracownikow.add(this);
        licznik++;
        this.numer = licznik;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }


    @Override
    public String toString() {
        return "Specjalista{" +
                "numer=" + numer +
                ", specjalizacja='" + specjalizacja + '\'' +
                ", numer=" + numer +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data=" + data +
                ", dzial=" + dzial +
                "} " + super.toString();
    }
}
