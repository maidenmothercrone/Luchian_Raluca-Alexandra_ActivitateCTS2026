package ro.ase.cts.a5.implementare;

public class Adapter implements IMedicament{
    private IMedicamentFarmacie referinta;

    public Adapter (IMedicamentFarmacie referinta) {this.referinta=referinta;}

    @Override
    public void achizitioneazaMedicament() {
        referinta.cumparaMedicament();
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Farmacia nu verifica reteta.");
    }
}
