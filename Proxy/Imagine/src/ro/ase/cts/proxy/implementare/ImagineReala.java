package ro.ase.cts.proxy.implementare;

public class ImagineReala implements IImagine{
    private String numeFisier;

    public ImagineReala(String numeFisier) {
        this.numeFisier = numeFisier;
        System.out.println("Incarcare imagine de pe un disc: " + numeFisier);
    }

    @Override
    public void afiseaza() {
        System.out.println("Afisare imagine: " + numeFisier);
    }
}
