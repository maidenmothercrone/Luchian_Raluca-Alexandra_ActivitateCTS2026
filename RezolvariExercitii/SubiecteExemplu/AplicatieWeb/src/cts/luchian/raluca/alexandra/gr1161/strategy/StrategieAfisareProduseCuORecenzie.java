package cts.luchian.raluca.alexandra.gr1161.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategieAfisareProduseCuORecenzie implements IStrategy{
   private List<Produs> produse = new ArrayList<>();

    @Override
    public void filtreaza(List<Produs> produse) {
        for(Produs produs : produse){
            if(produs.getNrRecenzii()>=1){
                System.out.println("Cu cel putin o recenzie sunt produsele:" + produs + "\n");
            }
        }
    }
}
