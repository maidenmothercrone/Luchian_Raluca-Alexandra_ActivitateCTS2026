package ro.ase.cts.b9.program;

import ro.ase.cts.b9.implementare.ProxyRezervare;

public class Main {
    static void main(String[] args) {
        ProxyRezervare rezervareGigel = new ProxyRezervare();
        ProxyRezervare rezervareIonel = new ProxyRezervare();
        rezervareGigel.rezerva("Gigel", 4);
        rezervareIonel.rezerva("Ionel", 3);
    }
}
