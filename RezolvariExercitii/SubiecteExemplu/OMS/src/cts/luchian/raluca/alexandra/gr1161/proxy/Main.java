package cts.luchian.raluca.alexandra.gr1161.proxy;

import cts.luchian.raluca.alexandra.gr1161.main.ISpital;
import cts.luchian.raluca.alexandra.gr1161.main.Proxy;

public class Main {
    static void main(String[] args) {
        ISpital spital = new Proxy();
        spital.acceseazaSalon("Gigel", true);
        spital.acceseazaSalon("Ionel", false);
        spital.acceseazaSalon("Gicu", true);
        spital.acceseazaSalon("George", true);
    }
}
