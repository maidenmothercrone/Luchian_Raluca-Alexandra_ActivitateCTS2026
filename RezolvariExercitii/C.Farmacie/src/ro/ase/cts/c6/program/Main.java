package ro.ase.cts.c6.program;

import ro.ase.cts.c6.implementare.Facade;

public class Main {
    static void main(String[] args) {
        Facade facade = new Facade();

        facade.proceseazaCerere("Gigel", "aspirina");
    }
}
