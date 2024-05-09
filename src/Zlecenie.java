import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;

public class Zlecenie implements
        Runnable
{


    public static int licznik = 0;

    int numer;

    ArrayList<Praca> listaPrac;

    Brygada brygada;

    LocalDateTime dataUtworzenia;
    LocalDateTime dataRozpoczecia;
    LocalDateTime dataUkonczenia;

    boolean plan;


    enum stanPlanowania {
        PLANOWANE,
        NIEPLANOWANE
    }

    public Zlecenie(ArrayList<Praca> listaPrac, Brygada brygada, Date dataUtworzenia, LocalDateTime dataRozpoczecia, LocalDateTime dataUkonczenia, boolean plan) {
        this.listaPrac = new ArrayList<Praca>();
        this.brygada = brygada;
        this.dataUtworzenia = LocalDateTime.now();
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataUkonczenia = dataUkonczenia;
        this.plan = false;
        licznik++;
        this.numer = licznik;
    }

    public<Brygada> Zlecenie(ArrayList<Praca> listaPrac,
                             Brygada brygada,
                             LocalDateTime dataUtworzenia,
                             LocalDateTime dataRozpoczecia,
                             LocalDateTime dataUkonczenia
                             ) {
        this.listaPrac = listaPrac;

        this.dataUtworzenia = dataUtworzenia;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataUkonczenia = dataUkonczenia;
    }
    public<listaPrac> Zlecenie(ArrayList<Praca> listaPrac, Brygada brygada, LocalDateTime dataUtworzenia, LocalDateTime dataRozpoczecia, LocalDateTime dataUkonczenia, boolean plan) {
        this.listaPrac = listaPrac;
        this.brygada = brygada;
        this.dataUtworzenia = dataUtworzenia;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataUkonczenia = dataUkonczenia;
        this.plan = plan;
    }
    public<listaPrac, Brygada> Zlecenie(ArrayList<Praca> listaPrac, Brygada brygada, LocalDateTime dataUtworzenia, LocalDateTime dataRozpoczecia, LocalDateTime dataUkonczenia, boolean plan) {
        this.listaPrac = listaPrac;

        this.dataUtworzenia = dataUtworzenia;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataUkonczenia = dataUkonczenia;
        this.plan = plan;
    }

    @Override
    public void run() {


        for (Praca p: Praca.listaPrac
             ) {


            p.run();
            listaPrac.remove(p);


        }


    }

    public void execute() {
        Executor executor = new Invoker();
        executor.execute( () -> {
            for (Praca p: Praca.listaPrac
            ) {


                p.run();
                listaPrac.remove(p);


            }
        });
    }





    //TODO Poutworzeniuobiektujestmożliwośćdodaniakolejnychpracpoprzezmetodę.


    @Override
    public String toString() {
        return "Zlecenie{" +
                "numer=" + numer +
                ", listaPrac=" + listaPrac +
                ", brygada=" + brygada +
                ", dataUtworzenia=" + dataUtworzenia +
                ", dataRozpoczecia=" + dataRozpoczecia +
                ", dataUkonczenia=" + dataUkonczenia +
                ", plan=" + plan +
                '}';
    }
}
