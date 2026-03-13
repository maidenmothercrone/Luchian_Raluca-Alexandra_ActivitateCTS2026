package ro.ase.cts.program;

import ro.ase.cts.factory.FabricaAbstracta;
import ro.ase.cts.factory.Personal;
import ro.ase.cts.factory.TipPersonal;

public class Program {
    static void main(String[] args) {
        Personal p1 = FabricaAbstracta.crearePersonal(TipPersonal.ASISTENT, "Ana", 20000);

        System.out.println(p1);
    }
}
