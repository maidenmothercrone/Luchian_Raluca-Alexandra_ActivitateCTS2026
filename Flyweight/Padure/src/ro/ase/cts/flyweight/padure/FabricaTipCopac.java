package ro.ase.cts.flyweight.padure;

import java.util.HashMap;
import java.util.Map;

public class FabricaTipCopac {
    private Map<String, TipCopac> cache = new HashMap<>();

    public TipCopac getCopac(String tip, String culoare){
        String cheie = tip  + culoare;
        if(!cache.containsKey(cheie)){
            cache.put(cheie, new TipCopac(tip, culoare));
        }
        return cache.get(cheie);
    }
}
