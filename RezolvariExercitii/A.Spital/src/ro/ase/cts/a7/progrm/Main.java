package ro.ase.cts.a7.progrm;

import ro.ase.cts.a7.implementare.DecoratorRezultatPrintat;
import ro.ase.cts.a7.implementare.IRezultat;
import ro.ase.cts.a7.implementare.RezultatConcret;

public class Main {
    static void main(String[] args) {
        IRezultat rezultatOnline = new RezultatConcret();
        IRezultat rezultatPrintat = new DecoratorRezultatPrintat(rezultatOnline);
        rezultatPrintat.publicaRezultat();
    }
}
