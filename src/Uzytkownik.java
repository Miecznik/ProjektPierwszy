import java.util.Comparator;
import java.util.Date;

public class Uzytkownik extends Pracownik{


    private static int licznik = 0;

    int numer;

    private String login;
    private String haslo;
    private String inicjaly;
    //TODO: musze wprowadzic metode ktora bedzie zmieniala inicjaly w przypadku zmiany imienia lub nazwiska

    public Uzytkownik(String imie, String nazwisko, Date data, Dzial dzial, String login, String haslo) {
        super(imie, nazwisko, data, dzial);
        this.haslo = haslo;
        this.login = login;
        this.inicjaly = generatorInicjalow(imie,nazwisko);
        listaPracownikow.add(this);
        licznik++;
        this.numer = licznik;

    }
    public String getLogin(){
        return this.login;
    }
    public String getHaslo(){
        return haslo;
    }

    //generator inicjalow
    private String generatorInicjalow(String imie, String nazwisko){
        String inicjaly = imie.toUpperCase().charAt(0) + ", " + nazwisko.toUpperCase().charAt(0);
        return inicjaly;
    }
    public String getInicjaly(){
        return inicjaly;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public void setInicjaly(String inicjaly) {
        this.inicjaly = inicjaly;
    }

    @Override

    public int compareTo(Object o) {
        return super.compareTo(o);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }


    @Override
    public String toString() {
        return "Uzytkownik{" +
                "numer=" + numer +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", inicjaly='" + inicjaly + '\'' +
                ", numer=" + numer +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data=" + data +
                ", dzial=" + dzial +
                "} " + super.toString();
    }
}
