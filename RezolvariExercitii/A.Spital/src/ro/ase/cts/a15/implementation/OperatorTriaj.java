package ro.ase.cts.a15.implementation;

import java.util.Stack;

public class OperatorTriaj {
    private IComanda comanda;

    public void setComanda(IComanda comanda) {
        this.comanda = comanda;
    }

    public void executa(){
        comanda.executa();
    }

    public void anuleaza(){
        comanda.anuleaza();
    }
}
