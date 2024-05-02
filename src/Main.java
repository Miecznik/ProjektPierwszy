import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //deklarowanie wartosci i inicjowanie wartosci przed ich uzyciem i poznieszym przypisaniem
        Brygada brygada1 = null;
        Brygada brygada2 = null;


        // tworzenie prac

        Praca praca1 = new Praca(10, false, "Budowa segmentu");

        //tworzenie dzialow
        Dzial murarze = Dzial.createDzial("Murarze");
        Dzial wykonczeniowka = Dzial.createDzial("Wykonczeniowka");
        Dzial dachy = Dzial.createDzial("Dachy");


        //dodawanie pracownikow
        Specjalista pracownik1 = new Specjalista("Janek","Kowalski", new Date(), murarze,"Muraz");
        Specjalista pracownik2 = new Specjalista("Andrzej","Kowalski", new Date(), murarze,"Muraz");
        Specjalista pracownik3 = new Specjalista("Franek","Kowalski", new Date(), wykonczeniowka,"Tynkarz");
        Specjalista pracownik4 = new Specjalista("Zygmunt","Kowalski", new Date(), wykonczeniowka,"Elektryk");
        Specjalista pracownik5 = new Specjalista("Zenon","Kowalski", new Date(), dachy,"Dacharz");
        Specjalista pracownik6 = new Specjalista("Brajan","Kowalski", new Date(), dachy,"Dacharz");
        Brygadzista brygadzista1 = new Brygadzista("Krzysztof","Kowalski", new Date(), null, "Krzysztof1", "haslo1", brygada1, null);
        Brygadzista brygadzista2 = new Brygadzista("Alfons","Kowalski", new Date(), null, "Alfons1", "haslo2", brygada2, null);


        //tworzenie brygad i przypisywanie brygadzistow
        brygada1 = new Brygada("Megamocni", brygadzista1, new ArrayList<Pracownik>());
        brygada2 = new Brygada("Twardoglowi", brygadzista2, new ArrayList<Pracownik>());

        //dodawanie pracownikow do brygad
        brygada1.addPracownik(pracownik1);
        brygada1.addPracownik(pracownik3);
        brygada1.addPracownik(pracownik5);

        brygada2.addPracownik(pracownik2);
        brygada2.addPracownik(pracownik4);
        brygada2.addPracownik(pracownik6);

        //dadawanie zlecenia

        Zlecenie zlecenie1 = new Zlecenie(Praca.listaPrac, brygada1, new Date(), null, null, false);



        Uzytkownik uzytkownik = new Uzytkownik("Marcin", "Altewegier", Date.from(Instant.now()), wykonczeniowka , "login", "haslo");
    System.out.println(uzytkownik.getInicjaly());



    }
}