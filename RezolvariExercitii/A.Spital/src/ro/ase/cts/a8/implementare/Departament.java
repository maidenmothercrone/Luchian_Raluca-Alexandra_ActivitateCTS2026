package ro.ase.cts.a8.implementare;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IDepartament{
    private String nume;
    private List<IDepartament> departamente = new ArrayList<>();

    public Departament(String nume) {
        this.nume = nume;
    }

    public void adaugaNod(IDepartament d){departamente.add(d);}
    public void stergeNod(IDepartament d){departamente.remove(d);}

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + " " + nume);
        for(IDepartament d : departamente){
            d.afiseaza(indent + " ");
        }
    }
}
