import java.util.ArrayList;

public class Brygada {

    String nazwa;
    Brygadzista brygadzista;

    ArrayList<Pracownik> listaPracownikowWBrygadzie;

    public Brygada(String nazwa, Brygadzista brygadzista, ArrayList<Pracownik> listaPracownikowWBrygadzie) {
        this.nazwa = nazwa;
        this.brygadzista = brygadzista;
        this.listaPracownikowWBrygadzie = listaPracownikowWBrygadzie;
    }


    
    public void addPracownik(Pracownik pracownik){
        
        //metoda ktora dodaje jednego pracownika
        listaPracownikowWBrygadzie.add(pracownik);
    }
    public void addPracownik(ArrayList<Pracownik> listaPracownikow, ArrayList<Pracownik> listaPracownikow2 ){
        //ta metoda dodaje wszystkich pracownikow z listy
        listaPracownikowWBrygadzie.addAll(listaPracownikow2);
        }
    }
    

