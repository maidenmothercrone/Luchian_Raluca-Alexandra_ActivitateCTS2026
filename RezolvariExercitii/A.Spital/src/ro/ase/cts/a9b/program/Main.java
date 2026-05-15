package ro.ase.cts.a9b.program;

import ro.ase.cts.a9b.implementare.InternareHandler;
import ro.ase.cts.a9b.implementare.VerificareAsigurare;

public class Main {
    static void main(String[] args) {
        VerificareAsigurare departamentAsigurari = new VerificareAsigurare();
        InternareHandler departamentInternari = new InternareHandler();
        departamentAsigurari.setUrmator(departamentInternari);

        departamentAsigurari.gestioneazaCerere("Gigel", false);
        departamentAsigurari.gestioneazaCerere("Ionel", true);
    }
}
