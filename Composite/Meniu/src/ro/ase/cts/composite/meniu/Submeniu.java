package ro.ase.cts.composite.meniu;

import java.util.ArrayList;
import java.util.List;

public class Submeniu implements ComponentMeniu{
    private String nume;
    private List<ComponentMeniu> copii = new ArrayList<>();

    public Submeniu(String nume){
        this.nume = nume;
    }

    public void adauga(ComponentMeniu c){
        copii.add(c);
    }
    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + nume);
        for (ComponentMeniu c : copii){
            c.afiseaza(indent + " ");
        }
    }
}
