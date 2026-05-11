package ro.ase.cts.e5.program;

import ro.ase.cts.e5.implementare.Adapter;
import ro.ase.cts.e5.implementare.EBiletImpl;
import ro.ase.cts.e5.implementare.IBilet;
import ro.ase.cts.e5.implementare.IEBilet;

public class Main {
    static void main(String[] args) {
        IEBilet ebilet = new EBiletImpl();
        IBilet adapter = new Adapter(ebilet);

        adapter.rezervaBilet("Gigel", 2);
        adapter.rezervaBilet("Ionel", 4);
        adapter.anuleazaRezervare("Gica");
        adapter.anuleazaRezervare("Gigel");
    }
}
