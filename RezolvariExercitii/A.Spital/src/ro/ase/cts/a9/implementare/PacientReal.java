package ro.ase.cts.a9.implementare;

public class PacientReal implements IPacient{
    public PacientReal() {
    }

    @Override
    public void interneaza(String numePacient) {
        System.out.println("Pacientul " + numePacient + " a fost internat");
    }
}
