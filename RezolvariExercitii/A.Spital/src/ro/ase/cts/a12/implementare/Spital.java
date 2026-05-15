package ro.ase.cts.a12.implementare;

import java.util.ArrayList;
import java.util.List;

public class Spital implements IObservabil{

    private List<IObserver> observator = new ArrayList<>();
    private String stare;
    @Override
    public void abonareObserver(IObserver o) {
        observator.add(o);
    }

    @Override
    public void dezabonareObserver(IObserver o) {
        observator.remove(o);
    }

    public void setStare(String stare) {
        this.stare = stare;
        notificareObservatori();
    }

    @Override
    public void notificareObservatori() {
        for(IObserver o : observator){
            o.notificare(stare);
        }
    }
}
