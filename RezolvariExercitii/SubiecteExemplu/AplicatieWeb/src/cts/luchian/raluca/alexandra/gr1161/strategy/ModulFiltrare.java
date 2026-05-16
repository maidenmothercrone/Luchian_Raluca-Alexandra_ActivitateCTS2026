package cts.luchian.raluca.alexandra.gr1161.strategy;

import java.util.ArrayList;
import java.util.List;

public class ModulFiltrare {
    private IStrategy strategie;
    private List<Produs> produse;

    public void setStrategie(IStrategy strategie) {
        this.strategie = strategie;
    }

    public ModulFiltrare(List<Produs> produse) {
        this.produse = produse;
    }

    public void filtreaza(){
        strategie.filtreaza(new ArrayList<>(produse));
    }
}
