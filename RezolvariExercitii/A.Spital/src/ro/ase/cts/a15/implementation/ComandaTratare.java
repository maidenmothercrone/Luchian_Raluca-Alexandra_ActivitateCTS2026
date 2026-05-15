package ro.ase.cts.a15.implementation;

public class ComandaTratare implements IComanda{
    private Medic medic;
    private String pacient;

    public ComandaTratare(Medic medic, String pacient) {
        this.medic = medic;
        this.pacient=pacient;
    }

    @Override
    public void executa() {
        medic.trateaza(pacient);
    }

    @Override
    public void anuleaza() {
        medic.externeaza(pacient);
    }
}
