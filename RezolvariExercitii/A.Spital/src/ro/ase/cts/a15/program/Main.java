package ro.ase.cts.a15.program;

import ro.ase.cts.a15.implementation.ComandaInternare;
import ro.ase.cts.a15.implementation.ComandaTratare;
import ro.ase.cts.a15.implementation.Medic;
import ro.ase.cts.a15.implementation.OperatorTriaj;

public class Main {
    static void main(String[] args) {
        Medic medic = new Medic("Gigel");
        OperatorTriaj rezident = new OperatorTriaj();

        rezident.setComanda(new ComandaInternare(medic, "Ionel"));
        rezident.executa();

        rezident.setComanda(new ComandaTratare(medic, "Ionel"));
        rezident.executa();
        rezident.anuleaza();
    }
}
