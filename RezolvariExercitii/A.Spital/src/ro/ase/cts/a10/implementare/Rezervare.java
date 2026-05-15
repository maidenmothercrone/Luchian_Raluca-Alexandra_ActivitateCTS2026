package ro.ase.cts.a10.implementare;

public class Rezervare {
    private DateClient dateClient;
    private String stareUnica;

    public Rezervare(DateClient d, String s){
        this.dateClient = d;
        this.stareUnica = s;
    }

    public void afiseaza(int nrMasa, int nrPersoane, String oraRezervare){
        dateClient.afiseaza(nrMasa, nrPersoane, oraRezervare);
    }
}
