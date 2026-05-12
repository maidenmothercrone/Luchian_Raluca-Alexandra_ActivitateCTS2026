package ro.ase.cts.c7.program;

import ro.ase.cts.c7.implementare.BonCasa;
import ro.ase.cts.c7.implementare.FelicitareDecorator;
import ro.ase.cts.c7.implementare.IBonCasa;

public class Main {
    static void main(String[] args) {
        IBonCasa bonSimplu = new BonCasa();
        IBonCasa bonDecorat = new FelicitareDecorator(bonSimplu);

        bonSimplu.printeaza();
        System.out.println("Bon decorat:");
        bonDecorat.printeaza();
    }
}
