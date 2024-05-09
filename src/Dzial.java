import java.util.ArrayList;

public class Dzial {

    public static int licznik = 0;

    int numer;
    private String nazwa;
    static ArrayList<String> sprawdzacz = new ArrayList<>();

    private Dzial(String nazwa) {
        this.nazwa = nazwa;
        licznik++;
        this.numer = licznik;
        }


    public static Dzial createDzial(String nazwa){

        sprawdzacz.add(""); //kiepskie rozwiazanie, ale na razie dziala
        boolean test = sprawdzacz.contains(nazwa);
        if(test){
            throw new NotUniqueNameException("Dzial o takiej nazwie istnieje");
        }
        else{
            sprawdzacz.add(nazwa) ;
        }
        return new Dzial(nazwa);
    }


//    public  Pracownik getWorkers(Dzial d) {
//        TODO metoda zwracajaca jacy pracownicy sa w dziale

//        return 0;
//    }

}
