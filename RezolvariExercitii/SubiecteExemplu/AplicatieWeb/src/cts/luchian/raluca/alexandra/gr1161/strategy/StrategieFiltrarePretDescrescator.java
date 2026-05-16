package cts.luchian.raluca.alexandra.gr1161.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategieFiltrarePretDescrescator implements IStrategy{
    private List<Produs> produse = new ArrayList<>();

    @Override
    public void filtreaza(List<Produs> produse) {
        produse.sort((p1, p2) -> Double.compare(p2.getPret(), p1.getPret()));
        for(Produs produs : produse){
            System.out.println("In ordine descrescatoare:" + produs + "\n");

        }

    }
}
