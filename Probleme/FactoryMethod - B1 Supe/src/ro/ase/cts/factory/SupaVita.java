package ro.ase.cts.factory;

public class SupaVita extends Supa{
    public SupaVita(double pret, int portii) {
        super(pret, portii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaVita{");
        sb.append("pret=").append(pret);
        sb.append(", portii=").append(portii);
        sb.append('}');
        return sb.toString();
    }
}
