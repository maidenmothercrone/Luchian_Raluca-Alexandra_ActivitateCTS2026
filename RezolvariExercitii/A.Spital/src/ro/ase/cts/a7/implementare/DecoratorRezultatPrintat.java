package ro.ase.cts.a7.implementare;

public class DecoratorRezultatPrintat extends RezultatDecorator {
    public DecoratorRezultatPrintat(IRezultat r) {
        super(r);
    }

    @Override
    public void publicaRezultat(){
        System.out.println("Rezultat publicat online");
        rezultat.publicaRezultat();
        System.out.println("Rezultat printat");
    }
}
