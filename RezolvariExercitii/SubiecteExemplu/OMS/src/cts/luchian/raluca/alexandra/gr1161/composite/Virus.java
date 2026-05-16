package cts.luchian.raluca.alexandra.gr1161.composite;

public class Virus implements  IComponentaOMS{
    private String nume;
    private String tulpina;
    private int nrCazuri;
    private String taraOrigine;

    public Virus(String nume, String tulpina, int nrCazuri, String taraOrigine) {
        this.nume = nume;
        this.tulpina = tulpina;
        this.nrCazuri = nrCazuri;
        this.taraOrigine = taraOrigine;
    }

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + " " + nume);
    }

    @Override
    public int getTotalCazuri() {
        return nrCazuri;
    }
}
