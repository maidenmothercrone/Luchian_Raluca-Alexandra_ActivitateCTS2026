package ro.ase.cts.factory;

public abstract class Personal {
    protected String name;
    protected double salariu;

    public Personal(String name, double salariu) {
        this.name = name;
        this.salariu = salariu;
    }
}
