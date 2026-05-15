package ro.ase.cts.a10.implementare;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
    private Map<String, DateClient> cache = new HashMap<>();

    public DateClient getObject(String nume, String tel, String adresa){
        if (!cache.containsKey(nume)){
            cache.put(nume, new DateClient(nume, tel, adresa));
        }
        return cache.get(nume);
    }
}
