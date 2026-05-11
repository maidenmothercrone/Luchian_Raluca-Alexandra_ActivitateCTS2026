package ro.ase.cts.c5.program;

import ro.ase.cts.c5.implementare.Adapter;
import ro.ase.cts.c5.implementare.ISoftNou;
import ro.ase.cts.c5.implementare.ISoftVechi;
import ro.ase.cts.c5.implementare.Soft;

public class Main {
    static void main(String[] args) {
        ISoftVechi soft = new Soft();
        ISoftNou adapter = new Adapter(soft);

        adapter.verificaStocPentruMedicament(1, 5);
    }
}
