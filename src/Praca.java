import java.util.ArrayList;

public class Praca extends Thread{

    public static int licznik = 0;

    int numer;

    enum RodzajPracy{
        OGOLNA,
        MONTAZ,
        DEMONTAZ,
        WYMIANA

    }
    RodzajPracy rodzajPracy;

    int czasPracy;
    boolean czyZrealizowane;
    String opis;

    static ArrayList<Praca> listaPrac = new ArrayList<>();




    public Praca(int czasPracy, String opis, RodzajPracy rodzajPracy) {
        this.czasPracy = czasPracy;
        this.czyZrealizowane = false;
        this.opis = opis;
        this.rodzajPracy = rodzajPracy;
        listaPrac.add(this);

        licznik++; //licz
        this.numer = licznik; //licz
    }

    public void run(){


        System.out.println(" Tutaj jest praca o opisie: " + this.opis + " o czasie wykoniania: " + this.czasPracy + " Rodzaj pracy " + this.rodzajPracy + " Czy zrealizowana: " + this.czyZrealizowane + " Praca o numerze: " + this.numer);

        //listaPrac.remove(this); // czy to to problematyczne ?
        this.czyZrealizowane = true;
    }


    @Override
    public String toString() {
        return "Praca{" +
                "numer=" + numer +
                ", rodzajPracy=" + rodzajPracy +
                ", czasPracy=" + czasPracy +
                ", czyZrealizowane=" + czyZrealizowane +
                ", opis='" + opis + '\'' +
                "} " + super.toString();
    }
}



