package ro.ase.cts.b5.implementare;

public class Adapter implements ISoftVechi{
    ISoftNou referinta;
    public Adapter(ISoftNou referinta){this.referinta=referinta;}
    @Override
    public void printeazaFactura() {
        referinta.getFactura();
    }
}
