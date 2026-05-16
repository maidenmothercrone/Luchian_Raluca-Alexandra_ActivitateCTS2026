package cts.luchian.raluca.alexandra.gr1161.composite;

import java.util.ArrayList;
import java.util.List;

public class Tara implements IComponentaOMS{
    private String nume;
    private List<IComponentaOMS> virusuri = new ArrayList<>();

    public Tara(String nume) {
        this.nume = nume;
    }

    public Tara adauga(IComponentaOMS virus){virusuri.add(virus); return this;}

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + " " + nume);
        for(IComponentaOMS virus : virusuri){
            virus.afiseaza(indent+ " ");
        }
    }

    @Override
    public int getTotalCazuri() {
        int total = 0;
        for (IComponentaOMS v : virusuri) {
            total += v.getTotalCazuri();
        }
        return total;
    }
}
