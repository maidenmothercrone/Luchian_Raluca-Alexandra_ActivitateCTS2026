package cts.luchian.raluca.alexandra.gr1161.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategieFiltrarePretCrescator implements IStrategy{

    private List<Produs> produse = new ArrayList<>();

    @Override
    public void filtreaza(List<Produs> produse) {
        produse.sort(Comparator.comparingDouble(Produs::getPret));
        for(Produs produs : produse){
                System.out.println("In ordine crescatoare:" + produs + "\n");

        }

    }
}
