import java.util.ArrayList;
import java.util.Date;

public abstract class Pracownik implements Comparable{

    static ArrayList<Pracownik> listaPracownikow = new ArrayList<>();

    protected String imie, nazwisko, dzial;
    protected Date data;

    @Override
    public int compareTo(Object o1) {
        return compare();
    }
}
