package ro.ase.cts.factory;

public class Asistent extends Personal{
    public Asistent(String name, double salariu) {
        super(name, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
