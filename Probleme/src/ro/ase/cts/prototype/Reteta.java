package ro.ase.cts.prototype;

public class Reteta implements IReteta {
    private String nume;
    private String descriere;
    private double concentratie;

    public Reteta() {
    }

    public Reteta(String nume, String descriere, double concentratie) {
        super();
        this.nume = nume;
        this.descriere = descriere;
        this.concentratie=concentratie;
    }

  public IReteta copiere(){
        Reteta reteta = new Reteta();
        reteta.nume=this.nume;
        reteta.descriere=this.descriere;
        reteta.concentratie=this.concentratie;
        return reteta;

  }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append(", concentratie=").append(concentratie);
        sb.append('}');
        return sb.toString();
    }
}
