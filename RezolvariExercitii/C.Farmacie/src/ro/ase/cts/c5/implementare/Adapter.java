package ro.ase.cts.c5.implementare;

public class Adapter implements ISoftNou{
    private ISoftVechi referintaSoft;

    public Adapter(ISoftVechi referintaSoft) {
        this.referintaSoft = referintaSoft;
    }

    @Override
    public void verificaStocPentruMedicament(int id, int nrMedicamente) {
        referintaSoft.setareMedicament(id);
        referintaSoft.verificareDisponibilitate(nrMedicamente);
    }
}
