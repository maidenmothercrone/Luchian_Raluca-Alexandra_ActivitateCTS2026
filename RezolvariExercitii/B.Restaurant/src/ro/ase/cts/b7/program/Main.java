package ro.ase.cts.b7.program;

import ro.ase.cts.b7.implementare.FelicitareDecorator;
import ro.ase.cts.b7.implementare.INotaDePlata;
import ro.ase.cts.b7.implementare.NotaDePlata;
import ro.ase.cts.b7.implementare.NotaDecorator;

public class Main {
    static void main(String[] args) {
        INotaDePlata notaSimpla = new NotaDePlata();
        INotaDePlata notaCuFelicitare = new FelicitareDecorator(notaSimpla);

        notaSimpla.printeaza();
        System.out.println("Nota cu decorator:");
        notaCuFelicitare.printeaza();


    }
}
