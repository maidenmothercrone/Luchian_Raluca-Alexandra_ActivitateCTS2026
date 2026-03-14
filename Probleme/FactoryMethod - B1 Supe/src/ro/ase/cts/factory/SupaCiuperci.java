package ro.ase.cts.factory;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(double pret, int portii) {
        super(pret, portii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append("pret=").append(pret);
        sb.append(", portii=").append(portii);
        sb.append('}');
        return sb.toString();
    }
}
