package ro.ase.cts.a9b.implementare;

public class InternareHandler extends Handler{
    @Override
    public void gestioneazaCerere(String pacient, boolean areAsigurare) {
        System.out.println("Pacientul " + pacient + " a fost internat");
    }
}
