import java.util.Date;

public class Brygadzista extends Uzytkownik{

    Brygada brygada;
    Zlecenie zlecenie;

    public Brygadzista(String imie, String nazwisko, Date data, Dzial dzial, String login, String haslo, Brygada brygada, Zlecenie zlecenie) {
        super(imie, nazwisko, data, dzial, login, haslo);
        this.brygada = brygada;
        this.zlecenie = zlecenie;
        listaPracownikow.add(this);
    }

}
