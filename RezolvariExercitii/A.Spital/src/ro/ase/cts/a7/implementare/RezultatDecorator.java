package ro.ase.cts.a7.implementare;

public abstract class RezultatDecorator implements IRezultat{
    protected IRezultat rezultat;
    public RezultatDecorator(IRezultat r) { this.rezultat = r; }

    public abstract void publicaRezultat();
}
