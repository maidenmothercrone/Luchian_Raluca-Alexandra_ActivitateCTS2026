package ro.ase.cts.factory;

public class SupaLegume extends Supa{

    public SupaLegume(double pret, int portii) {
        super(pret, portii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append("pret=").append(pret);
        sb.append(", portii=").append(portii);
        sb.append('}');
        return sb.toString();
    }
}
