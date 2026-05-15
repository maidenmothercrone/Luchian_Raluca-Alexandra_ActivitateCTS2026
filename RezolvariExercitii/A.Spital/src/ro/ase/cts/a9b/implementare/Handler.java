package ro.ase.cts.a9b.implementare;

public abstract class Handler {
    protected Handler urmator;
    public void setUrmator(Handler h) { this.urmator = h; }
    public abstract void gestioneazaCerere(String pacient, boolean areAsigurare);
}
