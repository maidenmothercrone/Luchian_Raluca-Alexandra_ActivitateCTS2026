package ro.ase.cts.a11.implementare;

public class ModulPlata {
    private IModPlata modPlata;

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void executa(double suma){
        modPlata.plateste(suma);
    }
}
