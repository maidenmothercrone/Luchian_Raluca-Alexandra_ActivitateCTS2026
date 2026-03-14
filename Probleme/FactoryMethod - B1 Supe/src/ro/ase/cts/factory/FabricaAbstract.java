package ro.ase.cts.factory;

public interface FabricaAbstract {
    static Supa creareSupa(TipSupa tip, double pret, int portii){
        switch (tip){
            case Legume -> {
                return new SupaLegume(pret, portii);
            }
            case Ciuperci -> {
                return new SupaCiuperci(pret, portii);
            }
            case Vita -> {
                return new SupaVita(pret, portii);
            }
            default -> throw new IllegalArgumentException();
        }
    }
}
