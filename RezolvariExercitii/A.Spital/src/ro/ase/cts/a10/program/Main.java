package ro.ase.cts.a10.program;

import ro.ase.cts.a10.implementare.DateClient;
import ro.ase.cts.a10.implementare.FabricaClienti;
import ro.ase.cts.a10.implementare.Rezervare;

public class Main {
    static void main(String[] args) {
        FabricaClienti fabricaClienti = new FabricaClienti();
        DateClient gigel = fabricaClienti.getObject("Gigel", "0745878996", "Bucuresti");

        new Rezervare(gigel, "Salon 1").afiseaza(3, 4, "13:00");
        new Rezervare(gigel, "Locatia 2").afiseaza(1, 2, "19:00");
    }
}
