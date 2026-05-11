package ro.ase.cts.d5.implementare;

public interface ICredit {
    void solicitaCredit(String cnp, double suma);
    boolean verificaEligibilitate(String cnp);
}
