package ro.ase.cts.e5.implementare;

public class EBiletImpl implements IEBilet{

    @Override
    public void creeazaComanda(String client, int loc) {
        System.out.println("Clientul " + client + " a achizitionat bilet cu locul " + loc);
    }

    @Override
    public void stergeComanda(String client) {
        System.out.println("Clientul " + client + " a anulat comanda.");
    }

    @Override
    public double calculeazaPret(int nrLoc) {
        double total = nrLoc * 50;
        System.out.println("Pret total " + total + " lei");
        return total;
    }
}
