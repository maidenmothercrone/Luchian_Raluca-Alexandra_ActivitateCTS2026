package cts.luchian.raluca.alexandra.gr1161.composite;

import java.util.ArrayList;
import java.util.List;

public class Continent implements IComponentaOMS{
    private String nume;
    private List<Tara> tari = new ArrayList<>();

    public Continent(String nume) {
        this.nume = nume;
    }

    public void adauga(Tara tara){tari.add(tara);}
    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + " " + nume);
        for(Tara tara : tari){
            tara.afiseaza(indent+ " ");
        }
    }

    @Override
    public int getTotalCazuri() {
        int total = 0;
        for (Tara t : tari) {
            total += t.getTotalCazuri();
        }
        return total;
    }
}
