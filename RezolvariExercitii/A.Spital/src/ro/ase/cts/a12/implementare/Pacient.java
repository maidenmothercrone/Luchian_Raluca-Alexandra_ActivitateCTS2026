package ro.ase.cts.a12.implementare;

public class Pacient implements IObserver{
    private String name;

    public Pacient(String name) {
        this.name = name;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(name + " a primit urmatoarea notificare: Exista un nou virus " + mesaj);
    }
}
