package ro.ase.cts.c7.implementare;

public abstract class BonDecorator implements IBonCasa{
    protected IBonCasa bon;

    public BonDecorator(IBonCasa bon) {
        this.bon = bon;
    }
}
