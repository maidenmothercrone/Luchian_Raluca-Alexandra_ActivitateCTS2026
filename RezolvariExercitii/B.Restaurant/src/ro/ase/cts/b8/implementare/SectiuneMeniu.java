package ro.ase.cts.b8.implementare;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements IComponentaMeniu{

    private String nume;
    private List<IComponentaMeniu> meniu = new ArrayList<>();

    public SectiuneMeniu(String nume) {
        this.nume = nume;
    }

    public void adaugaNod(IComponentaMeniu m){meniu.add(m);}
    public void stergeNod(IComponentaMeniu m){meniu.remove(m);}
    @Override
    public void afiseaza(String indent) {
        System.out.println(indent+ " " + nume);
        for(IComponentaMeniu m : meniu){
            m.afiseaza(indent + " ");
        }
    }
}
