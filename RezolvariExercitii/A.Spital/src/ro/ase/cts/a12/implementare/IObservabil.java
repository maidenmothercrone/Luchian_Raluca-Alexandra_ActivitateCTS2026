package ro.ase.cts.a12.implementare;

public interface IObservabil {
    void abonareObserver(IObserver o);
    void dezabonareObserver(IObserver o);
    void notificareObservatori();
}
