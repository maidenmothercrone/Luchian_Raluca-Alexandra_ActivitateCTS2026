package ro.ase.cts.d5.implementare;

public class Adapter implements ICredit{
    private ILeasing referintaLeasing;

    public Adapter(ILeasing referintaLeasing) {
        this.referintaLeasing = referintaLeasing;
    }

    @Override
    public void solicitaCredit(String cnp, double suma) {
        referintaLeasing.initializeazaClient(cnp);
        referintaLeasing.seteazaValoareLeasing(suma);
        referintaLeasing.aprobaLeasing();
    }

    @Override
    public boolean verificaEligibilitate(String cnp) {
        referintaLeasing.initializeazaClient(cnp);
        return referintaLeasing.aprobaLeasing();
    }
}
