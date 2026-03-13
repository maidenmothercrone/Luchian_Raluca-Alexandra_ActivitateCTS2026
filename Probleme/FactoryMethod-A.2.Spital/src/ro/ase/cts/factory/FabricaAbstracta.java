package ro.ase.cts.factory;

public interface FabricaAbstracta {
    static Personal crearePersonal(TipPersonal tip, String nume, double salariu ){
        switch (tip){
            case BRANCARDIER -> {
                return new Brancardier(nume, salariu);
            }
            case ASISTENT -> {
                return new Asistent(nume, salariu);
            }
            case MEDIC -> {
                return new Medic(nume, salariu);
            }
            default -> throw new IllegalArgumentException("Tip personal necunoscut: " + tip);
        }
    }
}
