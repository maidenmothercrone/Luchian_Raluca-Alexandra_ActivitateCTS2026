package cts.luchian.raluca.alexandra.gr1161.main;

import cts.luchian.raluca.alexandra.gr1161.composite.Continent;
import cts.luchian.raluca.alexandra.gr1161.composite.Tara;
import cts.luchian.raluca.alexandra.gr1161.composite.Virus;

public class Main {
    static void main(String[] args) {
        Continent continent = new Continent("Africa");
        Continent continent1 = new Continent("Asia");
        Continent continent2 = new Continent("Europa");

        continent.adauga(new Tara("Etiopia").adauga(new Virus("Ebola", "1", 124, "Etiopia")));
        continent1.adauga(new Tara("China").adauga(new Virus("Coronavirus", "4", 12324, "China")));
        continent2.adauga(new Tara("UK").adauga(new Virus("Hantavirus", "Andes", 1245, "Argentina")));

        continent.afiseaza("");
        continent1.afiseaza("");
        continent2.afiseaza("");
        System.out.println("Total cazuri Africa: " + continent.getTotalCazuri());

    }
}
