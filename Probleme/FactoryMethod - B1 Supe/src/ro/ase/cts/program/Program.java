package ro.ase.cts.program;

import ro.ase.cts.factory.FabricaAbstract;
import ro.ase.cts.factory.Supa;
import ro.ase.cts.factory.TipSupa;

public class Program {
    static void main(String[] args) {
        Supa vita = FabricaAbstract.creareSupa(TipSupa.Vita, 25, 1);
        System.out.println(vita);
    }

}
