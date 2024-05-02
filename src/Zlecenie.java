import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Zlecenie implements Runnable{

    ArrayList<Praca> listaPrac;

    Brygada brygada;

    LocalDateTime dataUtworzenia;
    Date dataRozpoczecia;
    Date dataUkonczenia;

    boolean plan;

    enum stanPlanowania {
        PLANOWANE,
        NIEPLANOWANE
    }

    public Zlecenie(ArrayList<Praca> listaPrac, Brygada brygada, Date dataUtworzenia, Date dataRozpoczecia, Date dataUkonczenia, boolean plan) {
        this.listaPrac = listaPrac;
        this.brygada = brygada;
        this.dataUtworzenia = LocalDateTime.now();
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataUkonczenia = dataUkonczenia;
        this.plan = false;
    }

    public<Brygada> Zlecenie(ArrayList<Praca> listaPrac,
                             Brygada brygada,
                             LocalDateTime dataUtworzenia,
                             Date dataRozpoczecia,
                             Date dataUkonczenia
                             ) {
        this.listaPrac = listaPrac;

        this.dataUtworzenia = dataUtworzenia;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataUkonczenia = dataUkonczenia;
    }
    public<listaPrac> Zlecenie(ArrayList<Praca> listaPrac, Brygada brygada, LocalDateTime dataUtworzenia, Date dataRozpoczecia, Date dataUkonczenia, boolean plan) {
        this.listaPrac = listaPrac;
        this.brygada = brygada;
        this.dataUtworzenia = dataUtworzenia;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataUkonczenia = dataUkonczenia;
        this.plan = plan;
    }
    public<listaPrac, Brygada> Zlecenie(ArrayList<Praca> listaPrac, Brygada brygada, LocalDateTime dataUtworzenia, Date dataRozpoczecia, Date dataUkonczenia, boolean plan) {
        this.listaPrac = listaPrac;

        this.dataUtworzenia = dataUtworzenia;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataUkonczenia = dataUkonczenia;
        this.plan = plan;
    }

    @Override
    public void run() {
        try {
            wait(50);
            System.out.println("Proba runa udana");
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }

    //TODO Poutworzeniuobiektujestmożliwośćdodaniakolejnychpracpoprzezmetodę.
}
