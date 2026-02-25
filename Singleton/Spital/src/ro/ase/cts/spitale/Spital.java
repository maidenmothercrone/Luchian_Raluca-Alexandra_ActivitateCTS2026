package ro.ase.cts.spitale;

public class Spital {
    private String nume;
    private boolean isPublic;
    private static Spital instanta = null;

    private Spital(String nume, boolean isPublic) {
        this.nume = nume;
        this.isPublic = isPublic;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", isPublic=").append(isPublic);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized Spital getInstance(){
        if (instanta==null){
            instanta = new Spital("Sfantul Pantelimon", true);
        }
        return instanta;
    }
}
