import java.util.ArrayList;

public class Praca extends Thread{

    enum rodzajPracy{
        OGOLNA,
        MONTAZ,
        DEMONTAZ,
        WYMIANA

    }
    int czasPracy;
    boolean czyZrealizowane;
    String Opis;
    static ArrayList<Praca> listaPrac;

    //co mi generator tutaj odjaniepawlił XD


    public Praca(int czasPracy, boolean czyZrealizowane, String opis) {
        this.czasPracy = czasPracy;
        this.czyZrealizowane = czyZrealizowane;
        Opis = opis;
        listaPrac.add(this);
    }
}



