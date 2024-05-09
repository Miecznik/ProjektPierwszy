import java.util.ArrayList;

public class Brygada {


    public static int licznik = 0;

    int numer;

    String nazwa;
    Brygadzista brygadzista;

    ArrayList<Pracownik> listaPracownikowWBrygadzie;

    public Brygada(String nazwa, Brygadzista brygadzista, ArrayList<Pracownik> listaPracownikowWBrygadzie) {
        this.nazwa = nazwa;
        this.brygadzista = brygadzista;
        this.listaPracownikowWBrygadzie = listaPracownikowWBrygadzie;
        licznik++;
        this.numer = licznik;
    }


    
    public void addPracownik(Pracownik pracownik){
        
        //metoda ktora dodaje jednego pracownika
        listaPracownikowWBrygadzie.add(pracownik);
    }
    public void addPracownik(ArrayList<Pracownik> listaPracownikow, ArrayList<Pracownik> listaPracownikow2 ){
        //ta metoda dodaje wszystkich pracownikow z listy
        listaPracownikowWBrygadzie.addAll(listaPracownikow2);
        }

    @Override
    public String toString() {
        return "Brygada{" +
                "numer=" + numer +
                ", nazwa='" + nazwa + '\'' +
                ", brygadzista=" + brygadzista +
                ", listaPracownikowWBrygadzie=" + listaPracownikowWBrygadzie +
                '}';
    }
}
    

