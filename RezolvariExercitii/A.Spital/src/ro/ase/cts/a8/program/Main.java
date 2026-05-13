package ro.ase.cts.a8.program;

import ro.ase.cts.a8.implementare.Departament;
import ro.ase.cts.a8.implementare.Sectie;

public class Main {
    static void main(String[] args) {
        Departament spital= new Departament("Spital Central");
        Departament cardiologie = new Departament("Cardiologie");
        Departament urgente = new Departament("Urgente");

        spital.adaugaNod(cardiologie);
        spital.adaugaNod(urgente);

        cardiologie.adaugaNod(new Sectie("Sectia ATI"));
        cardiologie.adaugaNod(new Sectie("Sectia Recuperare"));
        urgente.adaugaNod(new Sectie("Sectia Triaj"));

        spital.afiseaza("");
    }
}
