package ro.ase.cts.b9.implementare;

public class RezervareReala implements IRezervare{
    public RezervareReala() {
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane) {
        System.out.println(numeClient + " are o rezervare pentru " + nrPersoane + " persoane");
    }
}
