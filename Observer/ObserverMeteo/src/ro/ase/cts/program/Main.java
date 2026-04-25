package ro.ase.cts.program;

import ro.ase.cts.implementare.DisplayTelefon;
import ro.ase.cts.implementare.StatieMeteo;

public class Main {
    static void main(String[] args) {
        StatieMeteo statieMeteo = new StatieMeteo();
        statieMeteo.adaugaObserver(new DisplayTelefon());

        statieMeteo.notifica();
        statieMeteo.setTemperatura(30);
        statieMeteo.notifica();
    }
}
