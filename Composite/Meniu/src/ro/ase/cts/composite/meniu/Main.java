package ro.ase.cts.composite.meniu;

public class Main {
    static void main(String[] args) {
        Submeniu meniu = new Submeniu(" Meniu principal");
        Submeniu micDejun = new Submeniu("Mic dejun");
        Submeniu pranz = new Submeniu("Pranz");

        meniu.adauga(micDejun);
        meniu.adauga(pranz);
        micDejun.adauga(new FelDeMancare("    Oua jumari", 15));
        micDejun.adauga(new FelDeMancare("    Cafea", 10));
        pranz.adauga(new FelDeMancare("    Supa", 20));
        pranz.adauga(new FelDeMancare("    Friptura", 45));

        meniu.afiseaza("");
    }
}
