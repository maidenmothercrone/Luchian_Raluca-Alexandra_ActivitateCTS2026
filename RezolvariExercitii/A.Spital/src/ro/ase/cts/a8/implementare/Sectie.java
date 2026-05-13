package ro.ase.cts.a8.implementare;

public class Sectie implements IDepartament{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + " " + nume);
    }
}
