package ro.ase.cts.composite.meniu;

public class FelDeMancare implements ComponentMeniu{
    private String nume;
    private float pret;
    public FelDeMancare (String n, float p){
        this.nume = n;
        this.pret = p;
    }
    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + nume + " - " + pret + " RON");
    }
}
