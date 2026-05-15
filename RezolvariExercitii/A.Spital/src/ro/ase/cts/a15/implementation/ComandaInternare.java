package ro.ase.cts.a15.implementation;

public class ComandaInternare implements IComanda{
    private Medic medic;
    private String pacient;

    public ComandaInternare(Medic medic, String pacient) {
        this.medic = medic;
        this.pacient=pacient;
    }

    @Override
    public void executa() {
        medic.interneaza(pacient);
    }

    @Override
    public void anuleaza() {
        medic.externeaza(pacient);
    }
}
