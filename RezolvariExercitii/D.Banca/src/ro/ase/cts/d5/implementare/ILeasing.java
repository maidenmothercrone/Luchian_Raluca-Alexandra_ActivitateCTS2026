package ro.ase.cts.d5.implementare;

public interface ILeasing {
    void initializeazaClient(String cnp);
    void seteazaValoareLeasing(double valoare);
    boolean aprobaLeasing();
}
