package ro.ase.cts.a5.program;

import ro.ase.cts.a5.implementare.Adapter;
import ro.ase.cts.a5.implementare.IMedicament;
import ro.ase.cts.a5.implementare.IMedicamentFarmacie;
import ro.ase.cts.a5.implementare.MedicamentFarmacie;

public class Main {
    static void main(String[] args) {
        System.out.println("Farmacia folosind adapterul de obiecte pt medicamentele din spital");
        IMedicamentFarmacie farmacie = new MedicamentFarmacie();
        IMedicament adapter = new Adapter(farmacie);
        adapter.achizitioneazaMedicament();


    }
}
