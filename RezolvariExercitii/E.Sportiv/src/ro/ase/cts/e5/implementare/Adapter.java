package ro.ase.cts.e5.implementare;

public class Adapter implements IBilet{
    private IEBilet referintaEBilet;

    public Adapter(IEBilet referintaEBilet) {
        this.referintaEBilet = referintaEBilet;
    }

    @Override
    public void rezervaBilet(String numeClient, int nrLoc) {
        referintaEBilet.creeazaComanda(numeClient, nrLoc);
        referintaEBilet.calculeazaPret(nrLoc);
    }

    @Override
    public void anuleazaRezervare(String numeClient) {
        referintaEBilet.stergeComanda(numeClient);
    }
}
