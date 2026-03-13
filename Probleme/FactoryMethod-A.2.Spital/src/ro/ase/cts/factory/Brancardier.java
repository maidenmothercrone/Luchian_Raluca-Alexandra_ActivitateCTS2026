package ro.ase.cts.factory;

public class Brancardier extends Personal{

    public Brancardier(String name, double salariu) {
        super(name, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
