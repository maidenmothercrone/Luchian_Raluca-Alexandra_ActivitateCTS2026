package ro.ase.cts.a11.program;

import ro.ase.cts.a11.implementare.ModulPlata;
import ro.ase.cts.a11.implementare.PlataCard;
import ro.ase.cts.a11.implementare.PlataCash;

public class Main {
    static void main(String[] args) {
        ModulPlata modul= new ModulPlata();

        modul.setModPlata(new PlataCash());
        modul.executa(350);

        modul.setModPlata(new PlataCard());
        modul.executa(400);
    }
}
