package ro.ase.cts.implementare;

public interface ISubject {
    void adaugaObserver(IObserver o);
    void stergeObserver(IObserver o);
    void notifica();
}
