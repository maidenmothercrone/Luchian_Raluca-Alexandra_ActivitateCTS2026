package ro.ase.cts.d5.program;

import ro.ase.cts.d5.implementare.Adapter;
import ro.ase.cts.d5.implementare.ICredit;
import ro.ase.cts.d5.implementare.ILeasing;
import ro.ase.cts.d5.implementare.Leasingimpl;

public class Main {
    static void main(String[] args) {
        ILeasing leasing = new Leasingimpl();
        ICredit adapter = new Adapter(leasing);

        adapter.solicitaCredit("1050405160039", 5000);
    }
}
