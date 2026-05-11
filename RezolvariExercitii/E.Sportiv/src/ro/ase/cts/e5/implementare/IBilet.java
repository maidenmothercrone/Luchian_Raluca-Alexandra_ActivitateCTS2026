package ro.ase.cts.e5.implementare;

public interface IBilet {
    void rezervaBilet(String numeClient, int nrLoc);
    void anuleazaRezervare(String numeClient);
}
