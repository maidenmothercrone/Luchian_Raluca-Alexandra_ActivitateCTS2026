package cts.luchian.raluca.alexandra.gr1161.main;

import cts.luchian.raluca.alexandra.gr1161.strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Produs> produse = new ArrayList<>();
        produse.add(new Produs("Laptop", 3500.0, 10));
        produse.add(new Produs("Telefon", 1200.0, 0));
        produse.add(new Produs("Tableta", 2000.0, 5));

        ModulFiltrare modul = new ModulFiltrare(produse);
        modul.setStrategie(new StrategieFiltrarePretCrescator());
        modul.filtreaza();

        modul.setStrategie(new StrategieFiltrarePretDescrescator());
        modul.filtreaza();

        modul.setStrategie(new StrategieAfisareProduseCuORecenzie());
        modul.filtreaza();
    }
}
