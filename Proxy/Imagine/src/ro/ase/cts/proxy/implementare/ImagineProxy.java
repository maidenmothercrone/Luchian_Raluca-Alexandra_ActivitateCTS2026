package ro.ase.cts.proxy.implementare;

public class ImagineProxy implements IImagine{
    private String numeFisier;
   private IImagine imagine;

    public ImagineProxy(String numeFisier) {
        this.numeFisier = numeFisier;
    }


    @Override
    public void afiseaza() {
        if(imagine == null){
            imagine = new ImagineReala(numeFisier);
        }
        imagine.afiseaza();
    }
}
