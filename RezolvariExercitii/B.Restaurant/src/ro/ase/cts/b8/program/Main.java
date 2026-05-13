package ro.ase.cts.b8.program;

import ro.ase.cts.b8.implementare.ItemMeniu;
import ro.ase.cts.b8.implementare.SectiuneMeniu;

public class Main {
    static void main(String[] args) {
        SectiuneMeniu meniu = new SectiuneMeniu("Meniu");
        SectiuneMeniu bautura = new SectiuneMeniu("Bauturi");
        SectiuneMeniu suc = new SectiuneMeniu("Sucuri");
        SectiuneMeniu cafea = new SectiuneMeniu("Cafea");
        SectiuneMeniu desert = new SectiuneMeniu("Deserturi");
        meniu.adaugaNod(bautura);
        meniu.adaugaNod(desert);
        bautura.adaugaNod(suc);
        bautura.adaugaNod(cafea);

        ItemMeniu cola = new ItemMeniu("Coca Cola");
        ItemMeniu fanta = new ItemMeniu("Fanta");
        ItemMeniu espresso = new ItemMeniu("Espresso");
        ItemMeniu tiramisu = new ItemMeniu("Tiramisu");

        suc.adaugaNod(cola);
        suc.adaugaNod(fanta);
        cafea.adaugaNod(espresso);
        desert.adaugaNod(tiramisu);
        meniu.afiseaza("");
    }
}
