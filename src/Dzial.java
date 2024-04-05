public class Dzial {
    String nazwa;

    private Dzial(String nazwa) {
        this.nazwa = nazwa;
        try {

        }catch(NotUniqueNameException ex){

            //TODO unikalne nazwy dzialow pracownikow

            throw new NotUniqueNameException("Obiejt o takiej nazwie juz istnieje");

        }
    }

    public Dzial createDzial(String nazwa){
        return new Dzial(nazwa);
    }

    //TODO metoda zwracajaca jacy pracownicy sa w dziale
}
