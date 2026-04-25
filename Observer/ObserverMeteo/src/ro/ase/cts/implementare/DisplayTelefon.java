package ro.ase.cts.implementare;

public class DisplayTelefon implements IObserver{
    @Override
    public void actualizeaza(double temperatura) {
        System.out.println("Noua temperatura este: " +temperatura);
    }
}
