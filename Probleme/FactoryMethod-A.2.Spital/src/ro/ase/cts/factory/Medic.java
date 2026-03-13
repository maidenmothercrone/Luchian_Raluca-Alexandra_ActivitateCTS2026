package ro.ase.cts.factory;

public class Medic extends Personal{

    public Medic(String name, double salariu) {
        super(name, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
