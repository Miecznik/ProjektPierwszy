import java.util.Date;

public class Specjalista extends Pracownik{

    protected String specjalizacja;


    public Specjalista(String imie, String nazwisko, Date data, Dzial dzial, String specjalizacja) {
        super(imie, nazwisko, data, dzial);
        this.specjalizacja = specjalizacja;
        listaPracownikow.add(this);
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
}
