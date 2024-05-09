import java.util.Date;

public class Brygadzista extends Uzytkownik{

    public static int licznik = 0;

    int numer;

    Brygada brygada;
    Zlecenie zlecenie;

    public Brygadzista(String imie, String nazwisko, Date data, Dzial dzial, String login, String haslo, Brygada brygada, Zlecenie zlecenie) {
        super(imie, nazwisko, data, dzial, login, haslo);
        this.brygada = brygada;
        this.zlecenie = zlecenie;
        listaPracownikow.add(this);
        licznik++;
        this.numer = licznik;
    }


    @Override
    public String toString() {
        return "Brygadzista{" +
                "numer=" + numer +
                ", brygada=" + brygada +
                ", zlecenie=" + zlecenie +
                ", numer=" + numer +
                ", numer=" + numer +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data=" + data +
                ", dzial=" + dzial +
                "} " + super.toString();
    }
}
