package ro.ase.cts.a9.program;

import ro.ase.cts.a9.implementare.IPacient;
import ro.ase.cts.a9.implementare.ProxyPacient;

public class Main {
    static void main(String[] args) {
        IPacient proxyOk = new ProxyPacient(true);
        IPacient proxyNok = new ProxyPacient(false);
        proxyOk.interneaza("Gigel");
        proxyNok.interneaza("Ionel");
    }
}
