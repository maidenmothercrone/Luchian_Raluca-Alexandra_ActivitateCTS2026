package ro.ase.cts.implementare;

import java.util.ArrayList;
import java.util.List;

public class StatieMeteo implements ISubject{
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notifica();
    }

    private double temperatura;
    private List<IObserver> listaObservatori;

    public StatieMeteo() {
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IObserver o) {
        this.listaObservatori.add(o);
    }

    @Override
    public void stergeObserver(IObserver o) {
        this.listaObservatori.remove(o);
    }

    @Override
    public void notifica() {
        for (IObserver o : listaObservatori){
            o.actualizeaza(temperatura);
        }
    }
}
