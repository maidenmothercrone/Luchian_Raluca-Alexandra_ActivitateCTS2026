package ro.ase.cts.e5.implementare;

public interface IEBilet {
    void creeazaComanda(String client, int loc);
    void stergeComanda(String client);
    double calculeazaPret(int nrLoc);
}
