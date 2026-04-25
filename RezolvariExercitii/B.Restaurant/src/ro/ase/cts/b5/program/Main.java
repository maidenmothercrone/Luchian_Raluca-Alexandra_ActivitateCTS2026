package ro.ase.cts.b5.program;

import ro.ase.cts.b5.implementare.Adapter;
import ro.ase.cts.b5.implementare.ISoftNou;
import ro.ase.cts.b5.implementare.ISoftVechi;
import ro.ase.cts.b5.implementare.SoftNou;

public class Main {
    static void main(String[] args) {
        System.out.println("Factura generata cu softul nou");
        ISoftNou factura = new SoftNou();
        ISoftVechi adapter = new Adapter(factura);

        adapter.printeazaFactura();
    }
}
